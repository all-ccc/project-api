package com.groupc.weather.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.dto.request.qnaBoard.PatchQnaBoardRequestDto;
import com.groupc.weather.dto.request.qnaBoard.PostQnaBoardRequestDto;
import com.groupc.weather.dto.response.ResponseDto;
import com.groupc.weather.dto.response.qnaBoard.GetQnaBoardListResponseDto;
import com.groupc.weather.dto.response.qnaBoard.GetQnaBoardResponseDto;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.QnaBoardCommentRepository;
import com.groupc.weather.repository.QnaBoardRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.QnaBoardService;

@Service
public class QnaBoardServiceImplement implements QnaBoardService {
    private UserRepository userRepository;
    private ManagerRepository managerRepository;
    private QnaBoardRepository qnaBoardRepository;
    private QnaBoardCommentRepository qnaBoardCommentRepository;

    @Autowired
    public QnaBoardServiceImplement(
        UserRepository userRepository,
        ManagerRepository managerRepository,
        QnaBoardRepository qnaBoardRepository,
        QnaBoardCommentRepository qnaBoardCommentRepository
    ) {
        this.userRepository = userRepository;
        this.managerRepository = managerRepository;
        this.qnaBoardRepository = qnaBoardRepository;
        this.qnaBoardCommentRepository = qnaBoardCommentRepository;
    }

    @Override
    public ResponseEntity<ResponseDto> postQnaBoard(PostQnaBoardRequestDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postQnaBoard'");
    }

    @Override
    public ResponseEntity<ResponseDto> getQnaBoard(GetQnaBoardResponseDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQnaBoard'");
    }

    @Override
    public ResponseEntity<ResponseDto> getQnaBoardListResponseDto(GetQnaBoardListResponseDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQnaBoardListResponseDto'");
    }

    @Override
    public ResponseEntity<ResponseDto> patchQnaBoard(PatchQnaBoardRequestDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'patchQnaBoard'");
    }

    @Override
    public ResponseEntity<ResponseDto> deleteQnaBoard(Integer writerNumber, Integer qnaBoardNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteQnaBoard'");
    }


}
