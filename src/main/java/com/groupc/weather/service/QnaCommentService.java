package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.qnaBoard.PostQnaCommentRequestDto;



public interface QnaCommentService {
    public ResponseEntity<ResponseDto> postQnaComment(PostQnaCommentRequestDto dto);
    
}
