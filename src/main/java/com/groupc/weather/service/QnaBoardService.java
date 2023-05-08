package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.request.PostQnaBoardRequestDto;
import com.groupc.weather.dto.response.ResponseDto;

public interface QnaBoardService {
    public ResponseEntity<ResponseDto> postQnaBoard(PostQnaBoardRequestDto dto);
    
}
