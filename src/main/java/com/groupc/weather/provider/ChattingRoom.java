package com.groupc.weather.provider;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.dto.request.chatting.ChatDto;
import com.groupc.weather.entity.ChattingMessageEntity;
import com.groupc.weather.entity.ManagerEntity;
import com.groupc.weather.entity.UserEntity;
import com.groupc.weather.repository.ChattingMessageRepository;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.ChattingService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@Service
@RequiredArgsConstructor
public class ChattingRoom {
    private final UserRepository userRepository;
    private final ManagerRepository managerRepository;
    private final ChattingMessageRepository chattingMessageRepository;

    
    private String roomId;
    private Set<WebSocketSession> sessions = new HashSet<>();


    public void handlerActions(WebSocketSession session, ChatDto dto , ChattingService chattingService) {

        UserEntity userEntity = userRepository.findByUserNumber(dto.getUserNumber());
        

        if (dto.getType().equals(ChatDto.MessageType.ENTER)) {
            sessions.add(session);
            dto.setMessage(userEntity.getNickname() + "님이 입장했습니다.");
        } 
        if(dto.getType().equals(ChatDto.MessageType.EXIT)){
            dto.setMessage(userEntity.getNickname() + "님이 나가셨습니다.");
            sessions.remove(session);
        }
        ChattingMessageEntity chattingMessageEntity = new ChattingMessageEntity(dto);
        chattingMessageRepository.save(chattingMessageEntity);

        TextMessage textMessage = new TextMessage(dto.getMessage());
        sendMessage(textMessage.getPayload(), chattingService);

    }
    
    private <T> void sendMessage(T message, ChattingService chattingService) {
        sessions.parallelStream()
                .forEach(session -> chattingService.sendMessage(session, message));
    }
}