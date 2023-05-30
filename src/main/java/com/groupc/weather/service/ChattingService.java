package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.dto.ResponseDto;

public interface ChattingService {
    

    public ResponseEntity<ResponseDto> getChattingList(AuthenticationObject authenticationObject);
    public ResponseEntity<ResponseDto> createChattingRoom(AuthenticationObject authenticationObject);
    public ResponseEntity<ResponseDto> joinChattingRoom(AuthenticationObject authenticationObject,Integer roomId);
}
