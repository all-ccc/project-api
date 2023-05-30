package com.groupc.weather.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.common.util.CustomResponse;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.chatting.CreateChattingUserNumberDto;
import com.groupc.weather.entity.ChattingRoomEntity;
import com.groupc.weather.repository.ChattingRoomRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.ChattingService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChattingServiceImplement implements ChattingService {

    private final UserRepository userRepository;
    private final ChattingRoomRepository chattingRoomRepository; 

    @Override
    public ResponseEntity<ResponseDto> getChattingList(AuthenticationObject authenticationObject) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChattingList'");
    }

    @Override
    public ResponseEntity<ResponseDto> createChattingRoom(AuthenticationObject authenticationObject) {
            

        try {
            //채팅을 신청한 쪽에서 먼저 방을 만들고
            Integer createUserNumber = userRepository.findByEmail(authenticationObject.getEmail()).getUserNumber(); 
            ChattingRoomEntity chattingRoomEntity = new ChattingRoomEntity(createUserNumber);
            chattingRoomRepository.save(chattingRoomEntity);


        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }
            return CustomResponse.success();
    }

    @Override
    public ResponseEntity<ResponseDto> joinChattingRoom(AuthenticationObject authenticationObject, Integer roomId) {
     
        try {

            //존재하는 방 넘버인지 확인
            Integer userNumber = userRepository.findByEmail(authenticationObject.getEmail()).getUserNumber();
            boolean existedRoomId = chattingRoomRepository.existsByRoomNumber(roomId);
            if(!existedRoomId) return CustomResponse.notExistChattingRoomNumber();
            ChattingRoomEntity chattingRoomEntity = new ChattingRoomEntity(roomId,userNumber);
            chattingRoomRepository.save(chattingRoomEntity);
            

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return CustomResponse.success();
    }
    
    
}
