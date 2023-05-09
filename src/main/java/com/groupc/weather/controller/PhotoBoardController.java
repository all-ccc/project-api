package com.groupc.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.service.PhotoBoardService;

@RestController
@RequestMapping("/api/v1/photoBoard")
public class PhotoBoardController {
    
    private PhotoBoardService photoBoardService;

    @Autowired
    public PhotoBoardController(PhotoBoardService photoBoardService) {
        this.photoBoardService = photoBoardService;
    }
    
}
