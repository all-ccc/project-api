package com.groupc.weather.dto.response.board;

import java.util.List;

import com.groupc.weather.dto.response.ResponseDto;


public class GetUserBoardLikeDto extends ResponseDto{
    private List<BoardSummary> boardList;
}

class BoardSummary{
    private int boardNumber;
    private String boardTitle;
    private String boardContent;
    private String boardWriteDatetime;
    private int boardWriterNumber;
    private String boardWriterNickname;
    private String boardWriterProfileImageUrl;
    private int commentCount;
    private int likeCount;
    private BoardImageUrlList boardfisrtImageUrl;
    private List<HashList>hashtagList;
}

class BoardImageUrlList{
    //이미지 첨부
}