package com.groupc.weather.dto.response.board;

import javax.validation.constraints.NotBlank;

import com.groupc.weather.dto.ResponseDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetSearchListByWordResponseDto extends ResponseDto {

    @NotBlank
    private String searchWord;
    private int userNumber;
    private Temperature temperature;
    private WeatherInfo weatherInfo;

}

class Temperature {
    boolean Spring;
    boolean Summer;
    boolean midSummer;
    boolean Fall;
    boolean Winter;
    boolean midWinter;
}

class WeatherInfo {
    //! 여기서부터
}
