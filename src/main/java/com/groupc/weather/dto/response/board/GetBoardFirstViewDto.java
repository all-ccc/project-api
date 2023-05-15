package com.groupc.weather.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.resultSet.GetBoardListResult;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetBoardFirstViewDto extends ResponseDto {
    private List<BoardSummaryFirst> boardList;  

    public GetBoardFirstViewDto(List<GetBoardListResult> resultSet){
        super("SU","Success");

        List<BoardSummaryFirst> boardList = new ArrayList<>();

        for(GetBoardListResult result : resultSet){
            BoardSummaryFirst boardSummary = new BoardSummaryFirst(result);
            boardList.add(boardSummary);
        }
        this.boardList = boardList;
    }
    
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class BoardSummaryFirst{
    private int boardNumber;
    private String boardfirstImageUrl;

    public BoardSummaryFirst(GetBoardListResult resultSet){
        this.boardNumber = resultSet.getBoardNumber();
        this.boardfirstImageUrl = resultSet.getBoardfirstImageUrl();
    }
}
