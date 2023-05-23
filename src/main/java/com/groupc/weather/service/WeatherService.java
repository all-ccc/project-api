package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.response.weather.GetWeatherDataResponseDto;

public interface WeatherService {

    public ResponseEntity<? super GetWeatherDataResponseDto> getWeatherData(String location);
    
}
