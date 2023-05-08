package com.groupc.weather.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostQnaCommentRequestDto {
    @NotBlank
    @Email
    private String writerEmail;
    @NotBlank
    private int qnaBoardNumber;
    @NotBlank
    private String qnaCommnetContent;
    
}
