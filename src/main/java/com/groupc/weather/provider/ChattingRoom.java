package com.groupc.weather.provider;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketSession;

import com.groupc.weather.repository.ChattingMessageRepository;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.UserRepository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Service
@RequiredArgsConstructor
public class ChattingRoom {
    private final UserRepository userRepository;
    private final ManagerRepository managerRepository;
    private final ChattingMessageRepository chattingMessageRepository;

    
    private String roomId;
    private Set<WebSocketSession> sessions = new HashSet<>();
}