package com.groupc.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.service.PhotoBoardService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    
    private PhotoBoardService photoBoardService;

    @Autowired
    public UserController(PhotoBoardService photoBoardService) {
        this.photoBoardService = photoBoardService;
    }
}
