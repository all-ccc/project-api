package com.groupc.weather.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.qnaBoard.PostQnaBoardRequestDto;
<<<<<<< HEAD
=======
import com.groupc.weather.dto.ResponseDto;
>>>>>>> b2aeaba96d1a466424130579f7d9e082a3de01eb
import com.groupc.weather.dto.response.qnaBoard.GetQnaBoardResponseDto;
import com.groupc.weather.service.QnaBoardService;

@RestController
@RequestMapping("/api/v1/qnaBoard")
public class QnaBoardController {
    
    private QnaBoardService qnaBoardService;

    @Autowired
    public QnaBoardController(QnaBoardService qnaBoardService) {
        this.qnaBoardService = qnaBoardService;
    }

    //* 1. 게시물 등록 */
    @PostMapping("")
    public ResponseEntity<ResponseDto> postQnaBoard(
        @Valid @RequestBody PostQnaBoardRequestDto requestBody
    ) {
        ResponseEntity<ResponseDto> response = qnaBoardService.postQnaBoard(requestBody);
        return response;
    }
    
    //* 2. 특정 게시물 조회 */
    @GetMapping("/{qnaBoardNumber}")
    public ResponseEntity<ResponseDto> getQnaBoard(
        @Valid @RequestBody GetQnaBoardResponseDto requestBody
    ) {
        ResponseEntity<ResponseDto> response = qnaBoardService.getQnaBoard(requestBody);
        return response;
    }


    //* 3. 특정 게시물 수정(본인만) */

    //* 4. 특정 게시물 삭제(본인, 관리자만) */

    //* 5. 게시물 목록 조회 */

<<<<<<< HEAD
    
=======
} 
>>>>>>> b2aeaba96d1a466424130579f7d9e082a3de01eb

