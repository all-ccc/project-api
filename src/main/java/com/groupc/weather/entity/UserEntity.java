package com.groupc.weather.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.groupc.weather.dto.request.user.PostUserRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="User")
@Table(name="User")
public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userNumber;
    private String name;
    private String email;
    private String password;
    private String nickname;
    private String phoneNumber;
    private String address;
    private String gender;
    private String profileImageUrl;
    private String birthday;
    public UserEntity(PostUserRequestDto dto){
        this.name=dto.getUserName();
        this.email=dto.getUserEmail();
        this.password=dto.getUserPassword();
        this.nickname=dto.getUserNickname();
        this.phoneNumber=dto.getUserPhoneNumber();
        this.address=dto.getUserAddress();
        this.gender=dto.getUserGender();
        this.profileImageUrl=dto.getUserProfileImageUrl();
        this.birthday=dto.getUserBirthday();


    this.name= dto.getUserName();
    this.email=dto.getUserEmail();
    this.password=dto.getUserPassword();
    this.nickname=dto.getUserNickname();
    this.phoneNumber=dto.getUserPhoneNumber();
    this.address=dto.getUserAddress();
    this.gender=dto.getUserGender();
    this.birthday=dto.getUserBirthday();
    this.profileImageUrl=dto.getUserProfileImageUrl();

    }
}

