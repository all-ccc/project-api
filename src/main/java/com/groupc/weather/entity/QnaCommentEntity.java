package com.groupc.weather.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="QnaCommentUser")
@Table(name="QnaCommentUser")
public class QnaCommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qnaCommentNumber;
    private int userNumber;
    private int managerNumber;
    private int qnaBoardNumber;
    private String content;
    private String writeDatetime;
    private String userProfileImageUrl;
    private String managerProfileImageUrl;
    private String userNickname;
    private String managerNickname;
    
    // public QnaCommentEntity(PostQnaCommentRequestDto dto){
    //     Date now = new Date();
    //     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    //     String commentWriteDatetime = simpleDateFormat.format(now);
        
    //     this.userNumber = dto.getQnaBoardNumber(); //수정하셈
    //     this.qnaBoardNumber = dto.getQnaBoardNumber();
    //     this.qnaComment = dto.getQnaCommnetContent();
    //     this.qnaCommentWriteDatetime = commentWriteDatetime;
    // }

}
