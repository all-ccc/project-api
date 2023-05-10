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
    
    @Id
    private int imageNumber;
    
    private String imageUrl;
    private int boradNumber;
<<<<<<< HEAD
=======

>>>>>>> 502e05775237dedaee46b5ddccd244f378a3d6b8
}
