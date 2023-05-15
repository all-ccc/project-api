package com.groupc.weather.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.user.FindByEmailResponseDto;
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
        ResponseEntity<ResponseDto> resposne = userService.postUser(requestBody);
        return resposne;
    }

    // 유저 로그인
    @PostMapping("sign-in")
    public ResponseEntity<? super LoginUserResponseDto> LoginUser(
            @Valid @RequestBody LoginUserRequestDto requestBody) {
        ResponseEntity<? super LoginUserResponseDto> response = userService.LoginUser(requestBody);
        return response;
    }

    // 유저 이메일 찾기
    @PostMapping("find-email")
    public ResponseEntity<FindByEmailResponseDto> Findemail(
            @Valid @RequestBody FindByEmailResponseDto requestBody) {
        ResponseEntity<ResponseDto> response = userService.Findemail(requestBody);
        return response;
    }
    // 유저 비밀번호 찾기
    // 유저 정보 수정
    // 유저 정보 삭제

}
