package com.groupc.weather.dto.response.board;

import java.util.List;

import com.groupc.weather.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GetBoardListResponse {
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPostlist extends ResponseDto {
   
    //top5 사용!! 데이터 베이스 활용...

}
}

class BoardSummary{
    private int boardNumber;
    private String boardTitle;
    private String boardfisrtImageUrl;
}

