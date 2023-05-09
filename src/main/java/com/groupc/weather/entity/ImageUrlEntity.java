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
@Entity(name = "Image_Url")
@Table(name = "Image_Url")
public class ImageUrlEntity {
<<<<<<< HEAD
    
    @Id
    private int imageNumber;
    private String imageUrl;
    private int boradNumber;
=======
    private int imageNumber;
    private String imageUrl;
    private int boardNumber;
>>>>>>> 0dfb4c25f0b15f13590d9e4f30e52f92d10354f1
}
