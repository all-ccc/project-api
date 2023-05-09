package com.groupc.weather.dto.request.qnaBoard;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchQnaBoardRequestDto {
    @NotBlank
    private int userNumber;
    @NotBlank
    private int qnaBoardNumber;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    private String imageUrl;
}
