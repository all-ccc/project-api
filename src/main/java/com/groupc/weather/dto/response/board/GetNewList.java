package com.groupc.weather.dto.response.board;

import java.util.List;

import com.groupc.weather.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetNewList extends ResponseDto{

    List<BoardSummary> boardList;

}


class BoardSummary{
    private int boardNumber;
    private String boardTitle;
    private String boardWriteDatetime;
    private String boardWriterNickname;
    private String boardWriterProfileImageUrl;
    private int commentCount;
    private int likeCount;
    private BoardImageUrlList boardfisrtImageUrl;
    private List<HashList>hashtagList;
    
}

class HashList{
    private int boardNumber;
    private int hashTagNumber;
    private String hashTagContent;

}

