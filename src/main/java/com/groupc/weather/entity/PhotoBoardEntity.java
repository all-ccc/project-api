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
@Entity(name = "PhotoBoard")
@Table(name = "Photo_Board")
public class PhotoBoardEntity {

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

}
