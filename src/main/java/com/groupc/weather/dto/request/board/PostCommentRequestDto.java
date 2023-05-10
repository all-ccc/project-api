package com.groupc.weather.dto.request.board;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentRequestDto { 
    
    @NotBlank
    private int commentContent;

}

