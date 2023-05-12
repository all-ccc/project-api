package com.groupc.weather.service.implement;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.common.util.CustomResponse;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.PostCommentRequestDto;
import com.groupc.weather.entity.BoardEntity;
import com.groupc.weather.entity.CommentEntity;
import com.groupc.weather.entity.UserEntity;
import com.groupc.weather.repository.CommentRepository;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.CommentService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CommentServiceImplement implements CommentService{

    private final UserRepository userRepository;
    private final ManagerRepository managerRepository;
    private final CommentRepository commentRepository;

    @Override
    public ResponseEntity<ResponseDto> postComment(PostCommentRequestDto dto) {
    
        // 유저의 번호
        int writerUserNumber = dto.getCommentWriterNumber();
        // 관리자의 번호
        int managerNumber = dto.getManagerNumber();
        // 게시물의 번호 
        int boardNumber = dto.getBoardNumber();

        try {
            boolean existedWeriterUserNumber = userRepository.findByUserNumber(writerUserNumber);
            boolean existedManagerNumber = managerRepository.findByManagerNumber(managerNumber);

            // 사용자와 관리자가 존재하는지
            if(!existedWeriterUserNumber || existedManagerNumber) return CustomResponse.notExistUserNumber();
            // 존재하는 게시물인지!
            boolean existedBoardNumber = boardRepository.findByBoardNumber(boardNumber);
            if(!existedBoardNumber) return CustomResponse.notExistBoardNumber();

            CommentEntity commentEntity = new CommentEntity(dto);
            //db저장
            commentRepository.save(commentEntity);
            //dto반환
            return CustomResponse.success();
            
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }
        
        return CustomResponse.success();
    }


    @Override
    public ResponseEntity<ResponseDto> patchComment(Integer userNumber, PostCommentRequestDto dto) {
            
            Integer commentUserNumber = dto.getCommentWriterNumber();
            Integer commentBoardNumber = dto.getBoardNumber();
            String patchContent = dto.getCommentContent();

            try {
                //존재하지않는 게시물 반환
                BoardEntity boardEntity = boardRepository.findByBoardNumber(boardNumber); //레포지토리가 없어서 임의로 작성
                if(boardEntity == null) return CustomResponse.notExistBoardNumber();

                //존재하지 않는 사용자
                boolean existedUserNumber = userRepository.existsbyUserNumber(userNumber);
                if(!existedUserNumber) return CustomResponse.notExistUserNumber();
                //권한 없음
                CommentEntity commentEntity;
                boolean equalsWriter = commentEntity.getCommentNumber().equals(userNumber);
                if(!equalsWriter) return CustomResponse.noPermissions();
                
            } catch (Exception exception) {
                exception.printStackTrace();
                return CustomResponse.databaseError();


            }
            
            return null;
    }

    @Override
    public ResponseEntity<ResponseDto> deleteComment(Integer userNumber, Integer managerNumber, PostCommentRequestDto dto) { 

        Integer commentNumber = dto.getCommentWriterNumber();

        try {

            if(dto == null) {
                return CustomResponse.validationError();
            }

            //존재하지 않는 게시물 반환
            BoardEntity boardEntity = boardRepository.findByBoardNumber(boardNumber);
            if(boardEntity == null) return CustomResponse.notExistBoardNumber();
            //존재하지 않는 사용자 
            boolean existedUserNumber = userRepository.existsbyUserNumber(userNumber);
            if(!existedUserNumber) return CustomResponse.notExistUserNumber();
            boolean existedManagerNumber = managerRepository.existsbyManagerNumber(managerNumber);
            if(!existedManagerNumber) return CustomResponse.notExistManagerNumber();
            
            commentRepository.deleteByBoardNumber(commentNumber);


        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }
        return CustomResponse.success();
        }
    }
    



        
        
        
        
