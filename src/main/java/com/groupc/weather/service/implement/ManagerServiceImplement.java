package com.groupc.weather.service.implement;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.manager.PostManagerRequestDto;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.service.ManagerService;

public class ManagerServiceImplement implements ManagerService {

    private ManagerRepository managerRepository;

    @Override
    public ResponseEntity<ResponseDto> postManager(PostManagerRequestDto dto) {

        ResponseDto responseBody = null;

    }

}
