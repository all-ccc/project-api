package com.groupc.weather.dto.response.weather;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.WeatherEntity;

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
    
    public GetWeatherDataResponseDto(WeatherEntity weatherEntity) {
        super("SU", "Success");

        this.weatherId = weatherEntity.getWeatherId();
        this.weatherDescription = weatherEntity.getWeatherDescription();
        this.temperature = weatherEntity.getTemperature();
    }
}
