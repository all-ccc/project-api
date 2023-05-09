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
@Entity(name = "Comment")
@Table(name = "Comment")
public class CommentEntity {
    private int commentNumber;
    private int boardNumber;
    private int userNumber;
    private int managerNumber;
    private String commentContent;
    private String writeDatetime;
    private String userNickname;
    private String managerNickname;
    private String userImageProfileUrl;
    private String managerProfileUrl;

    public CommentEntity(PostCommentRequestDto dto , UserEntity userEntity) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);
        
        this.managerProfileUrl =userEntity.getManagerProfileUrl();
        this.managerNumber = userEntity.getManagerNumber(); //두개 물어보센
        this.userImageProfileUrl =userEntity.getUserImageProfileUrl();
        this.userNickname = userEntity.getUserNickname();
        
        this.boardNumber = dto.getBoardNumber();
        this.userNumber = dto.getUserNumber();
        this.commentContent = dto.getCommentContent();
        this.writeDatetime = writeDatetime();
    }
}