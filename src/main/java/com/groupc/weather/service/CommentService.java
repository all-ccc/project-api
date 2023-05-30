package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.PatchCommentRequestDto;
import com.groupc.weather.dto.request.board.PostCommentRequestDto;

public interface CommentService {

    public ResponseEntity<ResponseDto> postComment(PostCommentRequestDto dto);
    public ResponseEntity<ResponseDto> patchComment(PatchCommentRequestDto dto);
    public ResponseEntity<ResponseDto> deleteComment(Integer boardNumber, Integer userNumber, Integer commentNumber);
    
}
