package com.groupc.weather.common.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.ResponseDto;
<<<<<<< HEAD
=======


>>>>>>> 284e26c5874ae950481a6ebd110f27b7b8cfc1f5

public class CustomResponse {

    public static ResponseEntity<ResponseDto> success() {
        ResponseDto body = new ResponseDto("SU", "SUCCESS");
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    public static ResponseEntity<ResponseDto> databaseError() {

        ResponseDto errorBody = new ResponseDto("DE", "Database Error");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> validationError() {

        ResponseDto errorBody = new ResponseDto("VF", "Request Parameter Validation Failed");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserEmail() {
<<<<<<< HEAD

        ResponseDto errorBody = new ResponseDto("EU", "Existent User Email");
=======
        
        ResponseDto errorBody = new ResponseDto("EU","Existent User Email");
>>>>>>> 284e26c5874ae950481a6ebd110f27b7b8cfc1f5
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserNickname() {
<<<<<<< HEAD

        ResponseDto errorBody = new ResponseDto("EM", "Existent User Nickname");
=======
        
        ResponseDto errorBody = new ResponseDto("EM","Existent User Nickname");
>>>>>>> 284e26c5874ae950481a6ebd110f27b7b8cfc1f5
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserPhoneNumber() {
<<<<<<< HEAD

        ResponseDto errorBody = new ResponseDto("EP", "Existent User PhoneNumber");
=======
        
        ResponseDto errorBody = new ResponseDto("EP","Existent User PhoneNumber");
>>>>>>> 284e26c5874ae950481a6ebd110f27b7b8cfc1f5
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> notExistBoardNumber() {

        ResponseDto errorBody = new ResponseDto("NB", "Not-Existent Board Number");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> signInFailed() {

        ResponseDto errorBody = new ResponseDto("SF", "Sign In Failed");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

<<<<<<< HEAD
    public static ResponseEntity<ResponseDto> signInFailedEmail() {

        ResponseDto errorBody = new ResponseDto("SF", "Sign In Failed Undefinde Email");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> signInFailedPassword() {

        ResponseDto errorBody = new ResponseDto("SF", "Sign In Failed Undefinde Password");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> notExistUserNumber() {

        ResponseDto errorBody = new ResponseDto("NU", "Not-Existent User Number");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorBody); // 너가 누구인지 모른다
=======
    public static ResponseEntity<ResponseDto> notExistUserNumber() {
        
        ResponseDto errorBody = new ResponseDto("NU", "Not-Existent User Number");        
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorBody); //너가 누구인지 모른다
    }

    public static ResponseEntity<ResponseDto> notExistManagerNumber() {
        
        ResponseDto errorBody = new ResponseDto("NU", "Not-Existent Manager Number");        
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorBody); 
>>>>>>> 284e26c5874ae950481a6ebd110f27b7b8cfc1f5
    }

    public static ResponseEntity<ResponseDto> signUpFailed() {

        ResponseDto errorBody = new ResponseDto("SF", "Sign In Failed");
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> noPermissions() {

        ResponseDto errorBody = new ResponseDto("NT", "No Permissions");
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorBody); // 너가 누구인지는 알지만 권한이없음
        }
    }