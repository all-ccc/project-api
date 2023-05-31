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
import com.groupc.weather.entity.ManagerEntity;
import com.groupc.weather.entity.UserEntity;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.ChattingService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class ChattingRoom {
    private UserRepository userRepository;
    private ManagerRepository managerRepository;
    private String roomId;
    private Set<WebSocketSession> sessions = new HashSet<>();


    @Builder
    public ChattingRoom(String roomId) {
        this.roomId = roomId;
    }

    public void handlerActions(WebSocketSession session, ChatDto dto , ChattingService chattingService,@AuthenticationPrincipal AuthenticationObject authenticationObject) {
        if(!authenticationObject.isManagerFlag()){
        UserEntity userEntity = userRepository.findByEmail(authenticationObject.getEmail());
        Integer userNumber = userEntity.getUserNumber();
        

        if (dto.getType().equals(ChatDto.MessageType.ENTER)) {
            sessions.add(session);
            dto.setMessage(userNumber + "님이 입장했습니다.");
        } 
        if(dto.getType().equals(ChatDto.MessageType.EXIT)){
            dto.setMessage(userNumber + "님이 나가셨습니다.");
            sessions.remove(session);
        }

        TextMessage textMessage = new TextMessage(dto.getMessage());
        sendMessage(textMessage.getPayload(), chattingService);
        }

            ManagerEntity managerEntity = managerRepository.findByEmail(authenticationObject.getEmail());
            Integer userNumber = managerEntity.getManagerNumber();
            
    
            if (dto.getType().equals(ChatDto.MessageType.ENTER)) {
                sessions.add(session);
                dto.setMessage(userNumber + "님이 입장했습니다.");
            } 
            if(dto.getType().equals(ChatDto.MessageType.EXIT)){
                dto.setMessage(userNumber + "님이 나가셨습니다.");
                sessions.remove(session);
            }
    
            TextMessage textMessage = new TextMessage(dto.getMessage());
            sendMessage(textMessage.getPayload(), chattingService);
            
    







    }
    

    private <T> void sendMessage(T message, ChattingService chattingService) {
        sessions.parallelStream()
                .forEach(session -> chattingService.sendMessage(session, message));
    }
}