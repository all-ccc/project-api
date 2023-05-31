package com.groupc.weather.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.groupc.weather.dto.request.chatting.ChatDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Chatting_Message")
@Entity(name="ChattingMessage")
public class ChattingMessageEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer sequence;
    private Integer userNumber;
    private String roomId;
    private String message;
    private String date;
    private boolean view;
    
    public ChattingMessageEntity(ChatDto dto){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = 
            new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);
        
        
        this.userNumber = dto.getUserNumber();
        this.roomId = dto.getRoomId();
        this.message = dto.getMessage();
        this.date = writeDatetime;
        this.view = false;


    }

}
