package com.groupc.weather.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.qnaBoard.PostQnaCommentRequestDto;
import com.groupc.weather.service.QnaCommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/qnaComment")
public class QnaCommentController {
    private final QnaCommentService qnaCommentService;
    


    @PostMapping("post")
    public ResponseEntity<ResponseDto> postQnaComment(
        @Valid @RequestBody PostQnaCommentRequestDto requestBody

    ){
        ResponseEntity<ResponseDto> response = qnaCommentService.postQnaComment(requestBody);
        return response;
    }








}
