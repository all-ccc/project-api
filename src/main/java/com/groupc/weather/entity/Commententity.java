package com.groupc.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import com.groupc.weather.dto.request.board.PostCommentRequestDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int commentNumber;
    private int userNumber;
    private int managerNumber;
    private int boardNumber;
    private String userNickname;
    private String managerNickname;
    private String commentContent;
    private String writeDatetime;
    private String userProfileImageUrl;
    private String managerProfileImageUrl;

    public CommentEntity(PostCommentRequestDto dto) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);

        this.boardNumber = dto.getBoardNumber();
        this.userNumber = dto.getUserNumber();
        this.content = dto.getCommentContent();
        this.writeDatetime = writeDatetime;
    }
}
