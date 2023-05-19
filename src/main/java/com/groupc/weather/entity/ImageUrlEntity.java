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
@Entity(name = "ImageUrl")
@Table(name = "Image_Url")
public class ImageUrlEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageNumber;
    private String imageUrl;
    private int boardNumber;

    public ImageUrlEntity(String imageUrl, int boardNumber){
        this.imageUrl = imageUrl;
        this.boardNumber = boardNumber;

    }
}
