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
@Entity(name = "PhotoBoardComment")
@Table(name = "Photo_Board_Comment")
public class PhotoBoardCommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentNumber;
    private int userNumber;
    private int boardNumber;
    private String content;
    private String writeDatetime;
    private String userNickname;
    private String managerNickname;
    private String userProfileImageUrl;
    private String managerProfileImageUrl;

}
