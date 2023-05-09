package com.groupc.weather.dto.request.board;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchBoardRequestDto {
    @NotBlank
    private String boardWriteUserNumber;
    @NotBlank
    private Integer boardNumber;  
    @NotBlank
    private String boardTitle;
    @NotBlank
    private String boardContent;
    @NotBlank
    private String boardImageUrl;
    private List<HashTagList>boardHashtag;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class HashTagList{
    @Id
    @NotBlank
    private int hashtagNumber;

    @NotBlank
    @GeneratedValue
    private String hashtagContent;
}
