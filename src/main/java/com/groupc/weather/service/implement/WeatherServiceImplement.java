package com.groupc.weather.service.implement;

import java.net.URLEncoder;

import org.apache.catalina.connector.Response;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.groupc.weather.OpenWeather;
import com.groupc.weather.common.util.CustomResponse;
import com.groupc.weather.dto.response.weather.GetWeatherDataResponseDto;
import com.groupc.weather.service.WeatherService;

@Service
public class WeatherServiceImplement implements WeatherService {

    private String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";
    @Value("${open-weather-key}")
    private String openWeatherKey; // 발급받은 API key

    @Override
    public ResponseEntity<? super GetWeatherDataResponseDto> getWeatherData(String location) {
        GetWeatherDataResponseDto body = null;

        try {

            if (location == null) return CustomResponse.validationError();

            StringBuilder urlBuilder = new StringBuilder(BASE_URL);
            
            urlBuilder.append("?" + URLEncoder.encode("q", "UTF-8") + "=" + location);
            urlBuilder.append("&" + URLEncoder.encode("appid", "UTF-8") + "=" + openWeatherKey);
            urlBuilder.append("&" + URLEncoder.encode("lang", "UTF-8") + "=kr");
            urlBuilder.append("&" + URLEncoder.encode("units", "UTF-8") + "=metric");

            RestTemplate restTemplate = new RestTemplate();
            OpenWeather response = restTemplate.getForObject(urlBuilder.toString(), OpenWeather.class);

            JSONObject jsonObject = new JSONObject(response);

            int id_value = jsonObject.getJSONArray("weather")
                    .getJSONObject(0)
                    .getInt("id");

            String description_value = jsonObject.getJSONArray("weather")
                    .getJSONObject(0)
                    .getString("description");

            double temp_value = jsonObject.getJSONObject("main")
                    .getDouble("temp");

            body = new GetWeatherDataResponseDto();

            body.setWeatherId(id_value);
            body.setWeatherDescription(description_value);
            body.setTemperature((int) Math.round(temp_value)); // double -> int

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return ResponseEntity.status(HttpStatus.OK).body(body);
        
    }
    
}
