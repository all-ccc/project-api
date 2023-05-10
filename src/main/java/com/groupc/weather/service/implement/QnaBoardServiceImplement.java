package com.groupc.weather.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.dto.request.qnaBoard.PatchQnaBoardRequestDto;
import com.groupc.weather.dto.request.qnaBoard.PostQnaBoardRequestDto;
import com.groupc.weather.common.util.CustomResponse;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.response.qnaBoard.GetQnaBoardListResponseDto;
import com.groupc.weather.dto.response.qnaBoard.GetQnaBoardResponseDto;
import com.groupc.weather.entity.BoardEntity;
import com.groupc.weather.entity.QnaBoardEntity;
import com.groupc.weather.entity.resultSet.QnaBoardListResultSet;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.QnaBoardRepository;
import com.groupc.weather.repository.QnaCommentRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.QnaBoardService;

@Service
public class QnaBoardServiceImplement implements QnaBoardService {
    private UserRepository userRepository;
    private ManagerRepository managerRepository;
    private QnaBoardRepository qnaBoardRepository;
    private QnaCommentRepository qnaCommentRepository;

    @Autowired
    public QnaBoardServiceImplement(
        UserRepository userRepository,
        ManagerRepository managerRepository,
        QnaBoardRepository qnaBoardRepository,
        QnaCommentRepository qnaCommentRepository
    ) {
        this.userRepository = userRepository;
        this.managerRepository = managerRepository;
        this.qnaBoardRepository = qnaBoardRepository;
        this.qnaCommentRepository = qnaCommentRepository;
    }

    @Override
    public ResponseEntity<ResponseDto> postQnaBoard(PostQnaBoardRequestDto dto) {
        ResponseDto body = null;
        Integer userNumber = dto.getUserNumber();

        try {
            //* 존재하지 않는 유저 번호 반환 
            boolean existedUserNumber = userRepository.existsbyUserNumber(userNumber);
            if (!existedUserNumber) {
                ResponseDto errorBody = new ResponseDto("NU", "Non-Existent User Number");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorBody);
            }

            QnaBoardEntity qnaBoardEntity = new QnaBoardEntity(dto);
            qnaBoardRepository.save(qnaBoardEntity);

            body = new ResponseDto("SU", "Success");
            
        } catch (Exception exception) {
            //* 데이터베이스 오류 반환 
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return ResponseEntity.status(HttpStatus.OK).body(body);

    }

    @Override
    public ResponseEntity<? super GetQnaBoardResponseDto> getQnaBoard(Integer boardNumber) {
        GetQnaBoardResponseDto body = null;

        try {
            if (boardNumber == null) return CustomResponse.validationError();

            //* 존재하지 않는 게시물 번호 반환
            QnaBoardEntity qnaBoardEntity = qnaBoardRepository.findByQnaBoardNumber(boardNumber);
            if (qnaBoardEntity == null) return CustomResponse.notExistBoardNumber();

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return ResponseEntity.status(HttpStatus.OK).body(body);

    }

    @Override
    public ResponseEntity<? super GetQnaBoardListResponseDto> getQnaBoardListResponseDto() {
        GetQnaBoardListResponseDto body = null;

        try {
            List<QnaBoardListResultSet> resultSet = qnaBoardRepository.getQnaBoardList();
            body = new GetQnaBoardListResponseDto(resultSet);

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return ResponseEntity.status(HttpStatus.OK).body(body);

    }

    @Override
    public ResponseEntity<ResponseDto> patchQnaBoard(PatchQnaBoardRequestDto dto) {
        ResponseDto body = null;

        Integer userNumber = dto.getUserNumber();
        int qnaBoardNumber = dto.getQnaBoardNumber();
        String title = dto.getTitle();
        String content = dto.getContent();
        String imageUrl = dto.getImageUrl();

        try {

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return ResponseEntity.status(HttpStatus.OK).body(body);

    }

    @Override
    public ResponseEntity<ResponseDto> deleteQnaBoard(Integer userNumber, Integer boardNumber) {
        ResponseDto body = null;

        try {
            if (boardNumber == null) return CustomResponse.validationError();
            //* 존재하지 않는 게시물 번호 반환 
            QnaBoardEntity qnaBoardEntity = qnaBoardRepository.findByQnaBoardNumber(boardNumber);
            if (qnaBoardEntity == null) return CustomResponse.notExistBoardNumber();

            //* 존재하지 않는 유저 번호 반환 
            boolean existedUserNumber = userRepository.existsbyUserNumber(userNumber);
            if (!existedUserNumber) return CustomResponse.notExistUserNumber();
            
            // TODO : 인증 실패 -> 이건 나중에..
            // TODO : 권한 없음
            


        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return ResponseEntity.status(HttpStatus.OK).body(body);

    }

}
