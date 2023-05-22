package com.groupc.weather.dto.request.board;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.groupc.weather.entity.ImageUrlEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchBoardRequestDto {
    @NotBlank
    private Integer userNumber;
    @NotBlank
    private Integer boardNumber;  
    @NotBlank
    private String boardTitle;
    @NotBlank
    private String boardContent;
    @NotBlank
    private List<String> boardImageUrl;
    private List<String> boardHashtag;
}

// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// class HashTagList{
//     @Id
//     @NotBlank
//     private int hashtagNumber;

//     @NotBlank
//     @GeneratedValue
//     private String hashtagContent;
// }
