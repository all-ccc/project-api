package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.auth.SignInUserRequestDto;
import com.groupc.weather.dto.request.auth.SignUpUserRequestDto;

public interface AuthService {
    public ResponseEntity<ResponseDto> signUp(SignUpUserRequestDto dto);

    public ResponseEntity<? super SignInUserRequestDto> signIn(SignInUserRequestDto dto);
}
