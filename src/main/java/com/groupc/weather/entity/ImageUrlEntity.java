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
<<<<<<< HEAD
=======

>>>>>>> 502e05775237dedaee46b5ddccd244f378a3d6b8
>>>>>>> 0133066be7b7c5ab2e5c09d034467257b619c1a5
}
