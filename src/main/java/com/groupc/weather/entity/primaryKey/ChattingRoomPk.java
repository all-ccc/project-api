package com.groupc.weather.entity.primaryKey;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class ChattingRoomPk implements Serializable {

    @Column(name = "roomId")
    private Integer roomId;

    @Column(name = "userNumber")
    private Integer userNumber;

}
