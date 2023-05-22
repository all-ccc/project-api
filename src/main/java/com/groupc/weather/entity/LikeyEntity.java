package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.groupc.weather.entity.primaryKey.LikeyPk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="likey")
@Table(name = "likey")
@IdClass(LikeyPk.class)
public class LikeyEntity {

    @Id
    private Integer userNumber;
    @Id
    private Integer boardNumber;     
    

    public LikeyEntity(LikeyPk likeyPk){
        this.userNumber=likeyPk.getUserNumber();
        this.boardNumber=likeyPk.getBoardNumber();

    }
    

}

