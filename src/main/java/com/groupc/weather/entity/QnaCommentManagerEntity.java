package com.groupc.weather.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.groupc.weather.dto.request.PostQnaCommentRequestDto;
import com.groupc.weather.repository.ManagerRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="QnaCommentManager")
@Table(name="QnaCommentManager")
public class QnaCommentManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qnaCommentManagerNumber;
    private int managerNumber;
    private int qnaBoardNumber;
    private String qnaComment;
    private String qnaCommentWriteDatetime;
    
    public QnaCommentManagerEntity(PostQnaCommentRequestDto dto){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String commentWriteDatetime = simpleDateFormat.format(now);
        
        this.managerNumber =dto.getQnaBoardNumber();//수정하셈
        this.qnaBoardNumber = dto.getQnaBoardNumber();
        this.qnaComment = dto.getQnaCommnetContent();
        this.qnaCommentWriteDatetime = commentWriteDatetime;
    }
  

}
