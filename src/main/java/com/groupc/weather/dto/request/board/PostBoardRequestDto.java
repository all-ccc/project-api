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
    @NotNull
    private String title;
    @NotNull
    private String content;
    @NotNull
    private String imageUrl;
    @NotNull
    private List<ImageUrlList> imageUrlList;
    private List<HashTag> hashtagList;
    @NotNull
    private String weatherInfo;
    @NotNull
    private int temperature;

}
@Data
@NoArgsConstructor
@AllArgsConstructor
class ImageUrlList {
    @NotBlank
    private int imageNumber;
    @NotBlank
    private String imageUrl;
    @NotBlank
    private int boardNumber;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class HashTag {
    @NotBlank
    private int hashtagNumber;

    @NotBlank
    @GeneratedValue
    private String hashtagContent;
}
