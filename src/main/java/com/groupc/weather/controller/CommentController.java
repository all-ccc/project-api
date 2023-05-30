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

import com.groupc.weather.common.model.AuthenticationObject;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.DeleteCommentRequestDto;
import com.groupc.weather.dto.request.board.PatchCommentRequestDto;
import com.groupc.weather.dto.request.board.PostCommentRequestDto;
import com.groupc.weather.service.CommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/comment")
public class CommentController {
    
    private final CommentService commentService;
    

    //댓글 작성
    @PostMapping("commentPost")                                   
    public ResponseEntity<ResponseDto> postComment(@Valid @RequestBody PostCommentRequestDto requestBody){
        
        ResponseEntity<ResponseDto> response = commentService.postComment(requestBody);
        return response;
    }

    //댓글 수정
    @PatchMapping("commentPatch")
    public ResponseEntity<ResponseDto> patchComment( 
        @Valid @RequestBody  PatchCommentRequestDto requestBody)
        {
        
        ResponseEntity<ResponseDto> response = commentService.patchComment(requestBody);

        return response;
    }
    
    //댓글 삭제
    @DeleteMapping("{boardNumber}/{userNumber}/{commentNumber}")
    public ResponseEntity<ResponseDto> deleteComment(
        @PathVariable("boardNumber") Integer boardNumber,
        @PathVariable("userNumber") Integer userNumber,
        @PathVariable("commentNumber") Integer commentNumber) 
        {
             
            ResponseEntity<ResponseDto> response = commentService.deleteComment(boardNumber, userNumber, commentNumber);

             return response;
        }
}
