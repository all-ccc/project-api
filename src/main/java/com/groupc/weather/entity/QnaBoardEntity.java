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
@Entity(name = "QnaBoard")
@Table(name = "Qna_Board")
public class QnaBoardEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qnaBoardNumber;
    private String title;
    private String content;
    private String writeDatetime;
    private int userNumber;
    private String nickname;
    private String profileImageUrl;
    private String imageUrl;
}
