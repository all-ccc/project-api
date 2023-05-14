package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.PatchBoardRequestDto;
import com.groupc.weather.dto.request.board.PostBoardRequestDto;

public interface BoardService {
    
    public ResponseEntity<ResponseDto> postBoard(PostBoardRequestDto dto);
    public ResponseEntity<ResponseDto> postBoard(String userEmail, PostBoardRequestDto2 dto);

    public ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    public ResponseEntity<? super GetBoardListResponseDto> getBoardList();
    
    public ResponseEntity<ResponseDto> patchBoard(PatchBoardRequestDto dto);
    public ResponseEntity<ResponseDto> patchBoard(String userEmail, PatchBoardRequestDto2 dto);
    
    public ResponseEntity<ResponseDto> deleteBoard(String userNumber, Integer boardNumber);
}

