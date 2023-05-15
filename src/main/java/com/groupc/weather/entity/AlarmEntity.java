package com.groupc.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmEntity {
    private int AlarmNumber;
    private int userNumber;
    private String AlarmContent;
    
}
