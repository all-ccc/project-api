package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.groupc.weather.entity.primaryKey.ChattingRoomPk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Chatting_Room")
@Entity(name="ChattingRoom")
@IdClass(ChattingRoomPk.class)
public class ChattingRoomEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer roomId;
    @Id
    private Integer userNumber;

    public ChattingRoomEntity(Integer userNumber){
        this.userNumber=userNumber;
    }
    
}
