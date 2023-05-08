package com.groupc.weather.dto.request.board;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class LikeRequestDto {
@NotBlank
private Integer userNumber;
@NotBlank
private Integer boardNumber;
}

