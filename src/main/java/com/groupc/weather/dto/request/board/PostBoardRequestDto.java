package com.groupc.weather.dto.request.board;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostBoardRequestDto {
    @NotNull
    private int userNumber;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NotNull
    private List<String> imageUrlList;
    private List<String> hashtagList;
    @NotBlank
    private String weatherInfo;
    @NotNull
    private int temperature;

}