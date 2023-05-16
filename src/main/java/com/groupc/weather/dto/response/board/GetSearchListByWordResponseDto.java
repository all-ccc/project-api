package com.groupc.weather.dto.response.board;

import java.util.List;

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
    private List<Temperature> temperature;
    private WeatherInfo weatherInfo;

}

@Data
@NoArgsConstructor
class Temperature { // 체크박스 답변은 어떻게 받아올지
    private int Spring = 1;
    private int Summer = 2;
    private int midSummer = 3;
    private int Fall = 4;
    private int Winter = 5;
    private int midWinter = 6;
}

class WeatherInfo {
    //! 여기서부터
}
