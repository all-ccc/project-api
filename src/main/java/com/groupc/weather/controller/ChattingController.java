package com.groupc.weather.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.chatting.ChattingUserNumberDto;
import com.groupc.weather.dto.response.chatting.GetChattingListDto;
import com.groupc.weather.service.ChattingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v2/chatting")
@RequiredArgsConstructor
public class ChattingController {

    private final ChattingService chattingService;

    // 채팅 리스트 보기

    @GetMapping("/view")
    public ResponseEntity<? super GetChattingListDto> getChattingList(@AuthenticationPrincipal AuthenticationObject authenticationObject) {
        ResponseEntity<? super GetChattingListDto> response = chattingService.getChattingList(authenticationObject);
        return response;
    }

    // 채팅방 생성
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createChattingRoom(@AuthenticationPrincipal AuthenticationObject authenticationObject) {
        ResponseEntity<ResponseDto> response = chattingService.createChattingRoom(authenticationObject);
        return response;
    }
    //특정 유저 채팅방에 들어가져야함.

    @PostMapping("/join")
    public ResponseEntity<ResponseDto> joinChattingRoom(@AuthenticationPrincipal AuthenticationObject authenticationObject,Integer roomId) {
        ResponseEntity<ResponseDto> response = chattingService.joinChattingRoom(authenticationObject,roomId);
        return response;
    }

    



    // 채팅 메시지 리스트

    // 채팅 방 삭제

    // 채팅 메시지 저장



    
}
