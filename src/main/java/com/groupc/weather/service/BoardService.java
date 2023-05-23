package com.groupc.weather.service;

import org.springframework.http.ResponseEntity;
import com.groupc.weather.dto.response.board.GetBoardListResponseDto;
import com.groupc.weather.dto.response.board.GetBoardListResponsetop5Dto;
import com.groupc.weather.dto.response.board.GetBoardResponseDto;
import com.groupc.weather.entity.primaryKey.LikeyPk;
import com.groupc.weather.dto.response.board.GetBoardFirstViewDto;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.PatchBoardRequestDto;
import com.groupc.weather.dto.request.board.PostBoardRequestDto;


public interface BoardService {
    
    public ResponseEntity<ResponseDto> postBoard(PostBoardRequestDto dto);
    
    public ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    public ResponseEntity<? super GetBoardListResponseDto> getBoardMyList(Integer userNumber); //게시물 조회(본인 작성)
    public ResponseEntity<? super GetBoardListResponsetop5Dto> getBoardTop5();
    public ResponseEntity<? super GetBoardListResponseDto> getBoardList();
    public ResponseEntity<? super GetBoardFirstViewDto> getBoardFirstView();

    public ResponseEntity<ResponseDto> patchBoard(String userEmail, PatchBoardRequestDto dto); 

    public ResponseEntity<ResponseDto> deleteBoard(Integer userNumber, Integer boardNumber);

    public ResponseEntity<ResponseDto> likeBoard(LikeyPk likeyPk);
    public ResponseEntity<ResponseDto> likeDeleteBoard(Integer userNumber, Integer boardNumber);
    
    public ResponseEntity<? super GetBoardListResponseDto> getLikeBoardList(Integer userNumber);
    
    public ResponseEntity<? super GetBoardListResponseDto> getSearchListByWord(String searchWord);
    public ResponseEntity<? super GetBoardListResponseDto> getSearchListByHashtag(String hashtag);
   
}
