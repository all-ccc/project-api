package com.groupc.weather.entity;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
=======
import java.text.SimpleDateFormat;
import java.util.Date;

import com.groupc.weather.dto.request.board.PostPhotoBoardRequestDto;
>>>>>>> 1ec84c3e1ad2b561854b592e90ba37dc54812b5d

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD

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
    
=======
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
>>>>>>> 1ec84c3e1ad2b561854b592e90ba37dc54812b5d
}
