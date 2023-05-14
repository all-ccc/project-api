package com.groupc.weather.dto.request.board;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchBoardByWordRequestDto {

    @NotBlank
    private String searchWord;
    private int userNumber;
    private Temperature temperature;
    private WeatherInfo weatherInfo;

}

class Temperature {
    boolean Spring;
    boolean Summer;
    boolean Fall;
    boolean Winter;
}

class WeatherInfo {
    boolean  //! 여기서부터
}
