package com.groupc.weather.dto.response.board;

import java.util.List;

import com.groupc.weather.dto.ResponseDto;
<<<<<<< HEAD
=======
import com.groupc.weather.entity.resultSet.GetBoardListResult;
import com.groupc.weather.repository.BoardRepository;
>>>>>>> 42a2667902cd6a41cdcf6f31764c839d91679298

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class GetBoardFirstViewDto extends ResponseDto {
    private List<BoardFirstViewDto> boardList;  

    public GetBoardFirstViewDto(List<BoardFirstViewDto> resultSet){
        super("SU","Success");
        this.boardList = resultSet;
<<<<<<< HEAD
    }
=======
    
}
>>>>>>> 42a2667902cd6a41cdcf6f31764c839d91679298
}