package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.groupc.weather.dto.request.manager.PostManagerRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Manager")
@Table(name = "Manager")
public class ManagerEntity {
    @Id
    private Integer managerNumber;
    private String nickname;
    private String email;
    private String password;
    private String phoneNumber;
    private String profileImage;

    public ManagerEntity(PostManagerRequestDto dto) {
        this.managerNumber = dto.getManagerNumber();
        this.nickname = dto.getManagerNickname();
        this.email = dto.getManagerEmail();
        this.password = dto.getManagerPassword();
        this.phoneNumber = dto.getManagerPhoneNumber();
        this.profileImage = dto.getManagerProfileImage();
    }
}
