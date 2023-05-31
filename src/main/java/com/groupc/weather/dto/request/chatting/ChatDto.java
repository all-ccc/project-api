package com.groupc.weather.dto.request.chatting;

import javax.swing.MenuElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatDto {

    public enum MessageType{
        ENTER, TALK,EXIT
    }
    
    private MessageType type;
    private String roomId;
    private String message;

}
