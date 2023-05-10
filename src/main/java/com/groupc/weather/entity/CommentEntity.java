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
@Entity(name="Comment")
@Table(name="Comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int commentNumber;
    
    private int boardNumber;
    private int userNumber;
    private Integer managerNumber;
    private String commentContent;
    private String writeDatetime;
    private String userNickname;
    private String userImageProfileUrl;
    private String managerProfileUrl;
}

