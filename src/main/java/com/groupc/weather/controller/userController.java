package com.groupc.weather.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.user.LoginUserRequestDto;
import com.groupc.weather.dto.request.user.PostUserRequestDto;
import com.groupc.weather.dto.response.LoginUserResponseDto;
import com.groupc.weather.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 유저 등록
    @PostMapping("sign-up")
    public ResponseEntity<ResponseDto> postUser(
            @Valid @RequestBody PostUserRequestDto requestBody) {
        ResponseEntity<ResponseDto> reposne = userService.postUser(requestBody);
        return reposne;
    }

    // 유저 로그인
    @PostMapping("sign-in")
    public ResponseEntity<? super LoginUserResponseDto> LoginUser(
            @Valid @RequestBody LoginUserRequestDto requestBody) {
        ResponseEntity<? super LoginUserResponseDto> reponse = userService.LoginUser(requestBody);
        return reponse;
    }

    // 유저 이메일 찾기

    // 유저 비밀번호 찾기
    // 유저 정보 수정
    // 유저 정보 삭제

}
