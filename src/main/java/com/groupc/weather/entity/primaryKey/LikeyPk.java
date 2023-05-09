package com.groupc.weather.entity.primaryKey;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class LikeyPk implements Serializable {

    @Column(name = "user_number")
    private int userNumber;

    @Column(name = "board_number")
    private int boardNumber;

}
