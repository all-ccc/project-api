package com.groupc.weather.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.resultSet.GetBoardListResult;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class GetBoardListResponseDto extends ResponseDto{
    //top5 사용!! 데이터 베이스 활용...
    private List<BoardSummary> boardList;  //?top5List?  //?그냥 boardList???

    public GetBoardListResponseDto(List<GetBoardListResult>resultSet){
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
    private String boardfirstImageUrl;


    public BoardSummary(GetBoardListResult resultSet){
        this.boardNumber = resultSet.getBoardNumber();
        this.boardTitle = resultSet.getBoardTitle();
        this.boardfirstImageUrl = resultSet.getBoardfirstImageUrl();
}

}
