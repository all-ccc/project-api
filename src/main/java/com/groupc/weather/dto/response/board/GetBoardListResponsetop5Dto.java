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
public class GetBoardListResponsetop5Dto extends ResponseDto {
    private List<BoardListResultTop5Dto> boardList; 


    public GetBoardListResponsetop5Dto(List<BoardListResultTop5Dto>resultSet){
        super("SU","Success");
        this.boardList = resultSet;

}




}
