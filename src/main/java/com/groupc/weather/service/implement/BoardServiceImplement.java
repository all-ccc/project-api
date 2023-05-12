package com.groupc.weather.service.implement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupc.weather.repository.BoardRepository;
import com.groupc.weather.repository.CommentRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.BoardService;

@Service
public class BoardServiceImplement implements BoardService {
    
    private UserRepository userRepository;
    private BoardRepository boardRepository;
    private CommentRepository commentRepository;
    private LikyRepository likyRepository;

    @Autowired
    public BoardServiceImplement(
            UserRepository userRepository,
            BoardRepository boardRepository,
            CommentRepository commentRepository,
            LikeyRepository likyRepository){
        this.userRepository = userRepository;
        this.boardRepository = boardRepository;
        this.commentRepository = commentRepository;
        this.likyRepository = likyRepository;

        }

    


    }


