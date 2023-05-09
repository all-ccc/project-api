package com.groupc.weather.dto.request.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentRequestDto {
    
    
    private int boardNumber;
    private int writerNumber;
    private String commentContent;

    PostCommentRequestDto(UserEntity userEntity){
        this.writerNumber = userEntity.getUserNumber(); 
    }
}

