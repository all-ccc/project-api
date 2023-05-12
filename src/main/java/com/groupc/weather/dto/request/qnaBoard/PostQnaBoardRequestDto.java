package com.groupc.weather.dto.request.qnaBoard;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostQnaBoardRequestDto {
    @NotBlank
    private int userNumber;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    private String imageUrl;
}
