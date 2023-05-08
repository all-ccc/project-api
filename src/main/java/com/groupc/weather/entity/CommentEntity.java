package com.groupc.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.groupc.weather.dto.request.board.PostCommentRequestDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentEntity {
    private int commentNumber;
    private int boardNumber;
    private int userNumber;
    private String commentContent;
    private String writeDatetime;

    public CommentEntity(PostCommentRequestDto dto) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);

        this.boardNumber = dto.getBoardNumber();
        this.userNumber = dto.getUserNumber();
        this.commentContent = dto.getCommentContent();
        this.writeDatetime = writeDatetime;
    }
}