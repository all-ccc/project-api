package com.groupc.weather.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.ImageUrlEntity;
import com.groupc.weather.entity.resultSet.GetBoardListResult;
import com.groupc.weather.repository.ImageUrlRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class GetUserBoardLikeDto extends ResponseDto{
    private List<BoardSummary> boardList;
    public GetUserBoardLikeDto(List<GetBoardListResult> resultSet){
        super("SU","Success");

        List<BoardSummary> boardList = new ArrayList<>();

        for(GetBoardListResult result : resultSet){
            BoardSummary boardSummary = new BoardSummary(result);
            boardList.add(boardSummary);
        }
        this.boardList = boardList;
    }
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
    private List<HashList> hashtagList;
    private List<ImageUrlEntity> boardfirstImageUrl;
    
    public BoardSummary(GetBoardListResult resultSet){
        this.boardNumber = resultSet.getBoardNumber();
        this.boardTitle = resultSet.getBoardTitle();
        this.boardfirstImageUrl = imageUrlRepository.findByBoardNumber(boardNumber);
}
}

class BoardImageUrlList{
    Integer boardNumber;
    Integer imageNumber;
    String boardfirstImageUrl;

    public BoardImageUrlList(ImageUrlEntity imageUrlEntity){
        this.boardNumber =imageUrlEntity.getBoardNumber();
        this.imageNumber = imageUrlEntity.getImageNumber();
        this.boardfirstImageUrl =imageUrlEntity.getImageUrl();
    }

    //이미지 첨부하기 
}
