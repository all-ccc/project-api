package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.request.PostQnaCommentRequestDto;
import com.groupc.weather.dto.response.ResponseDto;

public interface QnaCommentService {
    public ResponseEntity<ResponseDto> postQnaComment(PostQnaCommentRequestDto dto);
    
}
