package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.user.LoginUserRequestDto;
import com.groupc.weather.dto.request.user.PostUserRequestDto;
import com.groupc.weather.dto.response.LoginUserResponseDto;

public interface UserService {
    public ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto);

    public ResponseEntity<? super LoginUserResponseDto> LoginUser(LoginUserRequestDto dto);

    public ResponseEntity<ResponseDto> deleteUser(PostUserRequestDto dto);
}
