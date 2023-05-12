package com.groupc.weather.dto.request.board;


import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostCommentRequestDto { 
    
    @NotBlank
    private int commentNumber;
    @NotBlank
    private Integer commentWriterNumber;
    @NotBlank
    private Integer managerNumber;
    @NotBlank
    private Integer boardNumber;
    @NotBlank
    private String commentContent;
    
}

