package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.socket.WebSocketSession;

import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.chatting.ChattingUserNumberDto;
import com.groupc.weather.dto.request.chatting.DeleteChattingRoomDto;

public interface ChattingService {
    

    public ResponseEntity<ResponseDto> getChattingList(AuthenticationObject authenticationObject);
    public ResponseEntity<ResponseDto> createChattingRoom(AuthenticationObject authenticationObject,ChattingUserNumberDto dto);
    public ResponseEntity<ResponseDto> deleteChattingRoom(AuthenticationObject authenticationObject,DeleteChattingRoomDto dto);

    public <T> void sendMessage(WebSocketSession session, T message);

}
