package com.groupc.weather.controller;


import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.PostCommentRequestDto;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.service.CommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("")
public class CommentController {
    
    private final CommentService commentService;
    private final ManagerRepository managerRepository;
    

    //댓글 작성
    @PostMapping("")                                   
    public ResponseEntity<ResponseDto> postComment(@Valid @RequestBody PostCommentRequestDto requestBody){
        
        ResponseEntity<ResponseDto> response = commentService.postComment(requestBody);
        return response;
    }

    //댓글 수정
    @PatchMapping()                 
    public ResponseEntity<ResponseDto> patchComment( 
        @Valid @RequestBody @AuthenticationPrincipal Integer userNumber, PostCommentRequestDto requestBody)
        {
        
        ResponseEntity<ResponseDto> response = commentService.patchComment(userNumber, requestBody);

        return response;
    }
    
    //댓글 삭제
    @DeleteMapping()
    public ResponseEntity<ResponseDto> deleteComment(
        @AuthenticationPrincipal Integer userNumber,
        @AuthenticationPrincipal Integer managerNUmber, 
        @PathVariable("commentNumber") PostCommentRequestDto commentNumber) 
        {
             
            ResponseEntity<ResponseDto> response = commentService.deleteComment(userNumber, managerNUmber, commentNumber);

             return response;
        }
}
