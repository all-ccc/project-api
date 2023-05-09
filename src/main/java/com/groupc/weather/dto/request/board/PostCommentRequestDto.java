package com.groupc.weather.dto.request.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentRequestDto {
    
    private int boardNumber;
    private String commentContent;
    public int getU;
}
