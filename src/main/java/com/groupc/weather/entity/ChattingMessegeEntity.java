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
@Table(name="Chatting_Messege")
@Entity(name="ChattingMessege")
public class ChattingMessegeEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer sequence;
    private Integer userNumber;
    private Integer roomId;
    private String message;
    private String date;
    private boolean view;
    
}
