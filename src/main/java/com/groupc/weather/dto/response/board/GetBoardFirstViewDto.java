package com.groupc.weather.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.resultSet.GetBoardListResult;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GetBoardFirstViewDto extends ResponseDto {
    private List<BoardSummaryFrist> boardList;  

    public GetBoardFirstViewDto(List<GetBoardListResult> resultSet){
        super("SU","Success");

        List<BoardSummaryFrist> boardList = new ArrayList<>();

        for(GetBoardListResult result : resultSet){
            BoardSummaryFrist boardSummary = new BoardSummaryFrist(result);
            boardList.add(boardSummary);
        }
        this.boardList = boardList;
    }
    
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class BoardSummaryFrist{
    private int boardNumber;
    private String boardfirstImageUrl;

    public BoardSummaryFrist(GetBoardListResult resultSet){
        this.boardNumber = resultSet.getBoardNumber();
        this.boardfirstImageUrl = resultSet.getBoardfirstImageUrl();
}
}
