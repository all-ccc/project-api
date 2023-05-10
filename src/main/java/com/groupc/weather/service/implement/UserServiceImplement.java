package com.groupc.weather.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.user.PostUserRequestDto;
import com.groupc.weather.entity.UserEntity;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.UserService;

@Service
public class UserServiceImplement implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto) {

        ResponseDto responseBody = null;

        String email = dto.getUserEmail();
        String nickname = dto.getUserNickname();
        String phoneNumber = dto.getUserPhoneNumber();

        try {
            // 이메일 중복 반환.
            boolean hasEmail = userRepository.existsByEmail(email);
            if (hasEmail) {
                responseBody = new ResponseDto("EU", "Existend User Eamil");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
            }
            // 닉네임 중복 반환
            boolean hasNickname = userRepository.existsByNickname(nickname);
            if (hasNickname) {
                responseBody = new ResponseDto("EN", "Existend User Nickname");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
            }
            // 핸드폰 번호 중복 반환
            boolean hasPhoneNumber = userRepository.existsByPhoneNumber(phoneNumber);
            if (hasPhoneNumber) {
                responseBody = new ResponseDto("EP", "Existend User PhoneNumber");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
            }

            // 유저 레코드 삽입
            UserEntity userEntity = new UserEntity(dto);
            userRepository.save(userEntity);

            responseBody = new ResponseDto("SU", "Success");

        } catch (Exception exception) {
            // 데이터베이스 오류
            exception.printStackTrace();
            responseBody = new ResponseDto("DE", "Database Error");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
        }

        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

}
