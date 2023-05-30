package com.groupc.weather.dto.request.chatting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatDto {


    private Integer roomId;
    private String sender;
    private String message;
    private String date;
    
}
