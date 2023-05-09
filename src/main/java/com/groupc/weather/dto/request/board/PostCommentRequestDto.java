package com.groupc.weather.dto.request.board;

import com.groupc.weather.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentRequestDto {
    
    private int boardNumber;
    private int userNumber;
    private String commentContent;

    PostCommentRequestDto(UserEntity userEntity){
        this.userNumber = userEntity.getUserNumber(); 
    }
}

