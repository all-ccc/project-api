package com.groupc.weather.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.dto.response.weather.GetWeatherDataResponseDto;
import com.groupc.weather.service.WeatherService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/weather")
public class WeatherController {

    private final WeatherService weatherService;

    //* 1. 날씨 데이터 가져오기 */
    @GetMapping("/{location}")
    public ResponseEntity<? super GetWeatherDataResponseDto> getWeatherData(
       @PathVariable String location 
    ) {
        ResponseEntity<? super GetWeatherDataResponseDto> response =
            weatherService.getWeatherData(location);
        return response;
    }

}
