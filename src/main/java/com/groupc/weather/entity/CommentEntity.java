package com.groupc.weather.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.groupc.weather.dto.request.board.PostCommentRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Comment")
@Entity(name="Comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer commentNumber;
    private Integer userNumber;
    private Integer managerNumber;
    private Integer boardNumber;
    private String userNickname;
    private String managerNickname;
    private String content;
    private String writeDatetime;
    private String userProfileImageUrl;
    private String managerProfileImageUrl;

    //가지고 있는 코멘트의 정보
    public CommentEntity(PostCommentRequestDto dto) {
        
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = 
            new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);

        this.commentNumber = dto.getCommentNumber();
        this.userNumber = dto.getCommentWriterNumber();
        this.managerNumber = dto.getManagerNumber();
        this.boardNumber = dto.getBoardNumber();
        this.content = dto.getCommentContent();
        this.writeDatetime = writeDatetime;
    }
}

