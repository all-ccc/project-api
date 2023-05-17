package com.groupc.weather.dto.response.board;

import java.util.List;

import com.groupc.weather.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class GetUserBoardLikeDto extends ResponseDto{
    private List<BoardSummary> boardList;
}


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    //이미지 첨부하기 
}
