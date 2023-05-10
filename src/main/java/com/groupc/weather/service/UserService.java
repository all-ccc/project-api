package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.user.PostUserRequestDto;

public interface UserService {
    public ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto);
}
