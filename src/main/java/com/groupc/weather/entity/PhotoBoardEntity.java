package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.groupc.weather.dto.request.board.PostPhotoBoardRequestDto;

import java.text.SimpleDateFormat;
import java.util.Date;

<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.groupc.weather.dto.request.board.PostPhotoBoardRequestDto;

=======
>>>>>>> 0dfb4c25f0b15f13590d9e4f30e52f92d10354f1
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "PhotoBoard")
@Table(name = "Photo_Board")
public class PhotoBoardEntity {
<<<<<<< HEAD
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
                Date now = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String writeDatetime = simpleDateFormat.format(now);

                this.boardNumber = dto.getBoardNumber();
                this.title = dto.getTitle();
                this.content = dto.getContent();
                this.imageUrl = dto.getImageUrl();
                this.weatherInfo = writeDatetime;
                this.viewCount = 0;

        }
=======

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardNumber;
    private String title;
    private String content;
    private String writeDatetime;
    private int temperature;
    private String weatherInfo;
    private int viewCount;
    private int userNumber;
 
    public PhotoBoardEntity(PostPhotoBoardRequestDto dto){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = 
        new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);

        this.boardNumber = dto.getBoardWriterNumber();
        this.title = dto.getBoardTitle();
        this.content = dto.getBoardContent();
        this.writeDatetime = writeDatetime;
        this.viewCount = 0;
    
}

>>>>>>> 0dfb4c25f0b15f13590d9e4f30e52f92d10354f1
}
