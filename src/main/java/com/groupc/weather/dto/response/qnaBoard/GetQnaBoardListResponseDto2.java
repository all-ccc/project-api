package com.groupc.weather.dto.response.qnaBoard;



import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.resultSet.QnaBoardListResultSet2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class GetQnaBoardListResponseDto2 extends ResponseDto{
    private List<QnaBoardSummary> qnaBoardList;
    
    public GetQnaBoardListResponseDto2(List<QnaBoardListResultSet2> resultSet){
        super("SU", "Success");

        List<QnaBoardSummary> qnaBoardList = new ArrayList<>(); 
        for(QnaBoardListResultSet2 result: resultSet){
            QnaBoardSummary qnaBoardSummary = new QnaBoardSummary(result);
            qnaBoardList.add(qnaBoardSummary);

        }

        this.qnaBoardList=qnaBoardList;

    }
    
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class QnaBoardSummary{
    public int qnaBoardNumber;
    public String qnaBoardTitle;
    public String qnaBoardWriteDatetime;
    public String qnaBoardWriterNickname;
    public String qnaBoardWriterProfileImageUrl;
    public boolean replyComplete;

    public QnaBoardSummary(QnaBoardListResultSet2 resultSet) {
        this.qnaBoardNumber = resultSet.getQnaBoardNumber();
        this.qnaBoardTitle = resultSet.getQnaBoardTitle();
        this.qnaBoardWriteDatetime = resultSet.getQnaBoardWriteDatetime();
        this.qnaBoardWriterNickname = resultSet.getQnaBoardWriterNickname();
        this.qnaBoardWriterProfileImageUrl = resultSet.getQnaBoardWriterProfileImageUrl();
        this.replyComplete = resultSet.getReplyComplete() == 1;
    }
}

