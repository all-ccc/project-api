package com.groupc.weather.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.PostCommentRequestDto;
import com.groupc.weather.repository.CommentRepository;
import com.groupc.weather.service.CommentService;

@Service
public class CommentServiceImplement implements CommentService{

    private CommentRepository commentRepository;

    @Autowired
    public CommentServiceImplement(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public ResponseEntity<ResponseDto> postComment(PostCommentRequestDto dto) {

        String commentContent = dto.getCommentContent();

        return null;

    }

    
    
}
