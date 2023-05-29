package com.groupc.weather.dto.request.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {
    private int weatherId;
    private String weatherDescription;
    private int temperature;
}
