package com.groupc.weather.dto.response.board;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.resultSet.BoardListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class GetBoardListResponseDto extends ResponseDto{
    //top5 사용!! 데이터 베이스 활용...
    private List<BoardSummary> boardList;  //?  //?그냥 boardList???

    public GetBoardListResponseDto(List<BoardListResultSet>resultSet){
        super("SU","Success");

        List<BoardSummary> boardList = new ArrayList<>();

        for(BoardListResultSet result : resultSet){
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
    private String boardfisrtImageUrl;


    public BoardSummary(BoardListResultSet resultSet){
        this.boardNumber = resultSet.getBoardNumber();
        this.boardTitle = resultSet.getBoardTitle();
        this.boardfisrtImageUrl = resultSet.getBoardfisrtImageUrl();
}

}
