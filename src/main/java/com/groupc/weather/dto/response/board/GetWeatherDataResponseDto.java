package com.groupc.weather.dto.response.board;

import org.apache.catalina.connector.Response;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.BoardEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetWeatherDataResponseDto extends ResponseDto {
    
    private int weatherId;
    private String weatherDescription;
    private int temperature;
    
    public GetWeatherDataResponseDto(BoardEntity boardEntity) {
        super("SU", "Success");

        this.weatherId = boardEntity.getWeatherId();
        this.weatherDescription = boardEntity.getWeatherDescription();
        this.temperature = boardEntity.getTemperature();
    }

}
