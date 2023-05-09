package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.groupc.weather.dto.request.board.LikeRequestDto;
import com.groupc.weather.dto.request.board.PostPhotoBoardRequestDto;
import com.groupc.weather.entity.primaryKey.LikyPk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="likey")
@Table(name = "likey")
@IdClass(LikyPk.class)
public class LikyEntity {
    @Id
    private int boardNumber;     
    @Id
    private int userNumber;
  

    LikyEntity(PostPhotoBoardRequestDto dto ){
        this.boardNumber = dto // 게시물번호
        this.userNumber = dto.getBoardNumber(); //작성자번호 인데 왜 boardNumber임... 
       }
    }