package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Likey")
@Table(name = "Likey")
public class LikeyEntity {
    @Id
    private int userNumber;
    @Id
    private int boardNumber;
}

