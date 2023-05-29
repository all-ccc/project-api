package com.groupc.weather.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.manager.ConvertManagerDto;
import com.groupc.weather.dto.request.manager.LoginManagerRequestDto;
import com.groupc.weather.dto.request.manager.PostManagerRequestDto;
import com.groupc.weather.dto.response.manager.LoginManagerResponseDto;
import com.groupc.weather.service.ManagerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/manager")
public class ManagerController {
    private final ManagerService managerService;

    @PostMapping("/converManager")                                   
    public ResponseEntity<ResponseDto> convertManager(     
    @AuthenticationPrincipal AuthenticationObject authenticationObject, @Valid @RequestBody ConvertManagerDto dto){
        
        ResponseEntity<ResponseDto> response = managerService.convertManager(authenticationObject,dto);
        return response;
    }

    @PostMapping("/sign-in")
    public ResponseEntity<? super LoginManagerResponseDto> LoginManager(
            @Valid @RequestBody LoginManagerRequestDto requestBody) {
        ResponseEntity<? super LoginManagerResponseDto> response = managerService.LoginManager(requestBody);
        return response;
    }

    @PostMapping("/sign-up")
    public ResponseEntity<ResponseDto> postManager(
        @Valid @RequestBody PostManagerRequestDto requestBody) {
            ResponseEntity<ResponseDto> response = managerService.postManager(requestBody);
        return response;
    }




}
