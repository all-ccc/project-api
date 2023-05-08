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
public class Commententity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int commentNumber;
    
    private int userNumber;
    private int boardNumber;
    private String content;
    private String date;
    private String userNickname;
    private String userProfileImage;
}
