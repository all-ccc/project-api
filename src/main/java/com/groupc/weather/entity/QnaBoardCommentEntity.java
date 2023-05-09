package com.groupc.weather.entity;

import javax.persistence.Entity;
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
@Entity(name = "QnaBoardComment")
@Table(name = "Qna_Board_Comment")
public class QnaBoardCommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qnaCommentNumber;
    private int qnaBoardNumber;
    private int userNumber;
    private int managerNumber;
    private String userProfileImageUrl;
    private String managerProfileImageUrl;
    private String userNickname;
    private String managerNickname;
    private String content;
    private String writeDatetime;

}
