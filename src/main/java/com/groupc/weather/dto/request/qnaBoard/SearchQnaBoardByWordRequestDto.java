package com.groupc.weather.dto.request.qnaBoard;

import javax.validation.constraints.NotBlank;

public class SearchQnaBoardByWordRequestDto {

    @NotBlank
    private String searchWord;
    
}
