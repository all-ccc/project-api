package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.groupc.weather.dto.request.board.PostPhotoBoardRequestDto;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {
private int boardNumber;
private int userNumber;
private String title;
private String content;
private String boardImageUrl;
private String writeDatetime;
private int temperature;
private String weatherInfo;
private int viewCount;



<<<<<<< HEAD
        public BoardEntity(PostPhotoBoardRequestDto dto) {
=======
 public BoardEntity(PostPhotoBoardRequestDto dto){
@Entity(name = "PhotoBoard")
@Table(name = "Photo_Board")
public class BoardEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int boardNumber;
        private int userNumber;
        private String title;
        private String content;
        private String imageUrl;
        private String writeDatetime;
        private int temperature;
        private String weatherInfo;
        private int viewCount;

        public PhotoBoardEntity(PostPhotoBoardRequestDto dto) {
>>>>>>> d3a2ffce6525bc2345521792edfb88ca62816e07
                Date now = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String writeDatetime = simpleDateFormat.format(now);

                this.boardNumber = dto.getBoardNumber();
                this.title = dto.getTitle();
                this.content = dto.getContent();
                this.boardImageUrl = dto.getImageUrl();
                this.weatherInfo = writeDatetime;
                this.viewCount = 0;
                
        }

}