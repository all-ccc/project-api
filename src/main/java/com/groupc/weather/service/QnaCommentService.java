package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.request.qnaBoard.PostQnaCommentRequestDto;
import com.groupc.weather.dto.ResponseDto;

public interface QnaCommentService {
    public ResponseEntity<ResponseDto> postQnaComment(PostQnaCommentRequestDto dto);
    
}
