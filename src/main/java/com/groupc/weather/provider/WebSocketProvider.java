package com.groupc.weather.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.dto.request.chatting.ChatDto;
import com.groupc.weather.entity.ChattingRoomEntity;
import com.groupc.weather.repository.ChattingRoomRepository;
import com.groupc.weather.service.ChattingService;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
@Component
public class WebSocketProvider extends TextWebSocketHandler {

    private final ObjectMapper objectMapper;
    private final ChattingService chattingService;
    private final ChattingRoomRepository chattingRoomRepository;
    private final ChattingRoom chattingRoom;
    private final JwtProvider jwtProvider;




    // * 메세지 송수신 */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        ChatDto ChatDto = objectMapper.readValue(payload, ChatDto.class);
        
        List<ChattingRoomEntity> chattingRoomEntitys = chattingRoomRepository.findByRoomId(ChatDto.getRoomId());

        for(ChattingRoomEntity chattingRoomEntity : chattingRoomEntitys){
            if(chattingRoomEntity.getUserNumber()==ChatDto.getUserNumber()){
                chattingRoom.handlerActions(session, ChatDto, chattingService);
                }            
        }       
    }

 

}

