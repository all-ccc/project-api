package com.groupc.weather.dto.request.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.groupc.weather.dto.ResponseDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginUserRequestDto {
    @NotBlank
    @Email
    private String UserEmail;
    @NotBlank
    private String UserPassword;
}
