package com.groupc.weather.service.implement;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.common.util.CustomResponse;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.chatting.CreateChattingUserNumberDto;
import com.groupc.weather.entity.ChattingRoomEntity;
import com.groupc.weather.provider.ChattingRoom;
import com.groupc.weather.repository.ChattingRoomRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.ChattingService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class ChattingServiceImplement implements ChattingService {

    private final UserRepository userRepository;
    private final ChattingRoomRepository chattingRoomRepository; 
    private final ObjectMapper objectMapper;
    private Map<String, ChattingRoom> chattingRooms;

    @Override
    public ResponseEntity<ResponseDto> getChattingList(AuthenticationObject authenticationObject) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChattingList'");
    }

    @Override
    public ResponseEntity<ResponseDto> createChattingRoom(AuthenticationObject authenticationObject,CreateChattingUserNumberDto dto) {
            

        try {
            //채팅을 신청한 쪽에서 먼저 방을 만들고
            Integer createUserNumber = userRepository.findByEmail(authenticationObject.getEmail()).getUserNumber();
            String roomId = UUID.randomUUID().toString();
            ChattingRoomEntity chattingRoomEntity = new ChattingRoomEntity(roomId,createUserNumber);
            ChattingRoomEntity chattingRoomEntity2 = new ChattingRoomEntity(roomId,dto.getUserNumber());
            chattingRoomRepository.save(chattingRoomEntity);
            chattingRoomRepository.save(chattingRoomEntity2);

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }
            return CustomResponse.success();
    }
    


    @Override
    public <T> void sendMessage(WebSocketSession session, T message) {
        try{
            session.sendMessage(new TextMessage(objectMapper.writeValueAsString(message)));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }
    
    
}
