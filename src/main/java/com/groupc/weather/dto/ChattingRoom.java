package com.groupc.weather.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.socket.WebSocketSession;

import com.groupc.weather.dto.request.chatting.ChatDto;
import com.groupc.weather.service.ChattingService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
class SessionGroup{
    private String room;
    private WebSocketSession session;

}


@Data
public class ChattingRoom {

    private List<SessionGroup> sessionList = new ArrayList<>();

    // * 메세지 송수신 */


    protected void handleTextMessage(WebSocketSession session, ChatDto message, ChattingService chattingService) throws Exception {
        String room = session.getHandshakeHeaders().getFirst("room");
        for(SessionGroup sessionGroup: sessionList){
            if(sessionGroup.getRoom().equals(room)){
                sessionGroup.getSession().sendMessage(message);
            }
        }
        
    }

}



