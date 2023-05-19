package com.groupc.weather.dto.request.board;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatchBoardRequestDto {
    @NotBlank
    private Integer boardWriteUserNumber;
    @NotBlank
    private Integer boardNumber;  
    @NotBlank
    private String boardTitle;
    @NotBlank
    private String boardContent;
    // 수정할 거   
    private List<ImageUrlList> imageUrlList;
    private List<HashtagList> hashtagList;

    // 추가할 거
    private String addImageUrlList;
    private String addHashtagContent;
  
    // 삭제할 거 
    private Integer deleteImageNumber;
    private Integer deleteHashtagNumber;

}

class ImageUrlList {
    Integer imageNumber;
    String imageUrl;
}
class HashtagList{
    Integer hashtagNumber;
    String hashtagContent;
}