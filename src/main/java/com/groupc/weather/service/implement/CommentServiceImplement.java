package com.groupc.weather.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.common.util.CustomResponse;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.PatchCommentRequestDto;
import com.groupc.weather.dto.request.board.PostCommentRequestDto;
import com.groupc.weather.entity.BoardEntity;
import com.groupc.weather.entity.CommentEntity;
import com.groupc.weather.entity.ManagerEntity;
import com.groupc.weather.entity.UserEntity;
import com.groupc.weather.repository.BoardRepository;
import com.groupc.weather.repository.CommentRepository;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.CommentService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CommentServiceImplement implements CommentService{

    private final UserRepository userRepository;
    private final BoardRepository boardRepository;
    private final CommentRepository commentRepository;

//댓글 작성 로직
    @Override
    public ResponseEntity<ResponseDto> postComment(PostCommentRequestDto dto) {
    
        // 댓글 작성유저
        int writerUserNumber = dto.getCommentWriterNumber();
        // 게시물의 번호 
        int boardNumber = dto.getBoardNumber();

        try {

            boolean existedWriterUserNumber = userRepository.existsByUserNumber(writerUserNumber);
            boolean existedBoardNumber = boardRepository.existsByBoardNumber(boardNumber);

            // 댓글작성자가 존재하는가
            if(!existedWriterUserNumber) return CustomResponse.notExistUserNumber();
            
            // 존재하는 게시물인지!
            if(!existedBoardNumber) return CustomResponse.notExistBoardNumber();

            UserEntity userEntity = new UserEntity();
            userEntity.setNickname(userEntity.getNickname());
            userEntity.setProfileImageUrl(userEntity.getProfileImageUrl());

            CommentEntity commentEntity = new CommentEntity(dto, userEntity);
            //db저장
            commentRepository.save(commentEntity);
            // dto반환
            return CustomResponse.success();
        
            ManagerEntity managerEntity = new ManagerEntity();
            managerEntity.setManagerNickname(managerEntity.getManagerNickname());
            managerEntity.setProfileImageUrl(managerEntity.getProfileImageUrl());

            CommentEntity commentEntity2 = new CommentEntity(dto, managerEntity);
            //db저장
            commentRepository.save(commentEntity);
            // dto반환
            return CustomResponse.success();
        
        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

    }

//댓글 수정 로직
    @Override
    public ResponseEntity<ResponseDto> patchComment(PatchCommentRequestDto dto) {
            
            Integer usreNumber = dto.getCommentWriterNumber();
            Integer boardNumber = dto.getBoardNumber();
            Integer commentNumber = dto.getCommentNumber();
            String commentContent = dto.getCommentContent();
            
            try {

                boolean existedBoardNumber = boardRepository.existsByBoardNumber(boardNumber);
                boolean existedUserNumber = userRepository.existsByUserNumber(usreNumber);
                boolean existedCommentNumber = commentRepository.existsByCommentNumber(commentNumber);
                
                 //존재하지않는 게시물 반환
                if(!existedBoardNumber) return CustomResponse.notExistBoardNumber();

                //존재하지 않는 사용자
                if(!existedUserNumber) return CustomResponse.notExistUserNumber();

                //존재하지 않는 댓글
                if(!existedCommentNumber) return CustomResponse.notExistCommentNumber();

                //댓글 작성자와 수정자가 같을때 받아올때는 수정자를 받아왓는데 작성자인지는 어떻게 처리를 해야되는가
                //어떻게 받아와야할지 모르겟다....
                // if(userNumber(수정자) == (작성자) )


                CommentEntity commentEntity = commentRepository.findByCommentNumber(commentNumber);
                commentEntity.setCommentContent(dto.getCommentContent());
                commentRepository.save(commentEntity);

                
            } catch (Exception exception) {
                exception.printStackTrace();
                return CustomResponse.databaseError();


            }
            
            return CustomResponse.success();
    }

    //댓글 삭제 로직
    @Override
    public ResponseEntity<ResponseDto> deleteComment(Integer boardNumber, Integer userNumber, Integer commentNumber) { 

        try {

            boolean existedBoardNumber = boardRepository.existsByBoardNumber(boardNumber);
            boolean existedUserNumber = userRepository.existsByUserNumber(userNumber);
            boolean existedCommentNumber = commentRepository.existsByCommentNumber(commentNumber);


            //존재하지 않는 게시물 반환
            if(!existedBoardNumber) return CustomResponse.notExistBoardNumber();
            
            //존재하지 않는 사용자
            if(!existedUserNumber) return CustomResponse.notExistUserNumber();

            //존재하지 않는 댓글
            if(!existedCommentNumber) return CustomResponse.notExistCommentNumber();

            commentRepository.deleteByCommentNumber(commentNumber);


        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }
        return CustomResponse.success();
        }
    }
    



        
        
        
        

