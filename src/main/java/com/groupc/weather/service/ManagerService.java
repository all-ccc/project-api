package com.groupc.weather.service;


import org.springframework.http.ResponseEntity;

import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.manager.ConvertManagerDto;
import com.groupc.weather.dto.request.manager.LoginManagerRequestDto;
import com.groupc.weather.dto.response.manager.LoginManagerResponseDto;

public interface ManagerService {
    public ResponseEntity<ResponseDto> convertManager(AuthenticationObject authenticationObject,ConvertManagerDto dto);;
    public ResponseEntity<? super LoginManagerResponseDto> LoginManager(LoginManagerRequestDto dto);
}

