
package com.groupc.weather.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.user.FindByEmailRequestDto;
import com.groupc.weather.dto.request.user.FindByPasswordRequestDto;
import com.groupc.weather.dto.request.user.LoginUserRequestDto;
import com.groupc.weather.dto.request.user.PatchUserRequestDto2;
import com.groupc.weather.dto.request.user.PostUserRequestDto;
import com.groupc.weather.dto.response.user.FindByEmailResponseDto;
import com.groupc.weather.dto.response.user.FindByPasswordResponseDto;
import com.groupc.weather.dto.response.user.LoginUserResponseDto;
import com.groupc.weather.entity.UserEntity;
import com.groupc.weather.provider.JwtProvider;
import com.groupc.weather.repository.UserRepository;
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
    public ResponseEntity<? super FindByEmailResponseDto> FindByemail(
            @Valid @RequestBody FindByEmailRequestDto requestBody) {
        ResponseEntity<? super FindByEmailResponseDto> response = userService.FindByEmail(requestBody);
        return response;
    }

    // 유저 비밀번호 찾기
    @PostMapping("find-password")
    public ResponseEntity<? super FindByPasswordResponseDto> FindByPassword(
            @Valid @RequestBody FindByPasswordRequestDto requestBody) {
        ResponseEntity<? super FindByPasswordResponseDto> response = userService.FindByPassword(requestBody);
        return response;
    }

    // 유저 정보 수정
    @PatchMapping("")
    public ResponseEntity<ResponseDto> patchUser(
            @AuthenticationPrincipal String userEmail,
            @Valid @RequestBody PatchUserRequestDto2 requestBody) {
        ResponseEntity<ResponseDto> response = userService.patchUser(userEmail, requestBody);
        return response;
    }


    // 유저 정보 삭제
    @DeleteMapping("")
    public ResponseEntity<ResponseDto> deleteByUser(
            @Valid @RequestBody @AuthenticationPrincipal Integer userNumber, PostUserRequestDto dto) {
        ResponseEntity<ResponseDto> response = userService.deleteUser(dto);
        return response;
    }

    //로그아웃
    // @GetMapping(value = "/user")
    // public ResponseEntity<String> getUserInfo(@RequestParam(value = "jwt", required = true) String jwt) {
    //     String email = JwtProvider.validation(jwt); // JWT 검증 후, 인증된 email 가져오기
    //     UserEntity userEntity = UserRepository.findbyuserEmail(email); // email로 DB 검색
    //     if(userEntity != null) {
    //         String token = userEntity.getToken(); // 검색된 userEntity의 Token 값 가져오기
    //         return ResponseEntity.ok(token); // Token 값 반환
    //     } else {
    //         return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // 찾지 못했을 경우 Not Found 에러 반환
    //     }
    // }

}