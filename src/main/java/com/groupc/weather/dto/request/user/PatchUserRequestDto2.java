package com.groupc.weather.dto.request.user;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchUserRequestDto2 {
    @NotNull
    private Integer userNumber;
    @NotBlank
    private String userPassword;
    @NotBlank
    private String userNickname;
    @NotBlank
    @Pattern(regexp = "^\\d{3}-\\d{3,4}-\\d{4}$")
    private String userPhoneNumber;
    @NotBlank
    private String userAddress;
    @NotBlank
    private String userProfileImageUrl;
    @NotBlank
    private String userGender;
    @NotBlank
    private Date userBirhDay;

    public PatchUserRequestDto2(PatchUserRequestDto dto) {
        this.userNumber = dto.getUserNumber();
        this.userPassword = dto.getUserPassword();
        this.userNickname = dto.getUserNickname();
        this.userPhoneNumber = dto.getUserPhoneNumber();
        this.userAddress = dto.getUserAddress();
        this.userProfileImageUrl = dto.getUserProfileImageUrl();
        this.userGender = dto.getUserGender();
        this.userBirhDay = dto.getUserBirhDay();
    }
}
