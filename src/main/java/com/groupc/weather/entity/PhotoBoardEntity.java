package com.groupc.weather.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.groupc.weather.dto.request.board.PostPhotoBoardRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotoBoardEntity {
private int boardNumber;
private int usernumber;
private String Title;
private String Content;
private String boardImageUrl;
private String writeDatetime;
private int temperature;
private String weatherInfo;
private int viewCount;



 public PhotoBoardEntity(PostPhotoBoardRequestDto dto){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = 
        new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);

        this.boardNumber = dto.getBoardWriterNumber();
        this.Title = dto.getBoardTitle();
        this.Content = dto.getBoardContent();
        this.boardImageUrl = dto.getBoardImageUrl();
        this.writeDatetime = writeDatetime;
        this.viewCount = 0;
    
        }
}
