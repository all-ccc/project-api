package com.groupc.weather.dto.response.qnaBoard;

import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.resultSet.QnaBoardListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class GetQnaBoardSearchListResponseDto extends ResponseDto {

    private List<QnaBoardSummary> qnaBoardList;

    public GetQnaBoardSearchListResponseDto(List<QnaBoardListResultSet> resultSet) {
        super("SU", "Success");

        List<QnaBoardSummary> qnaBoardList = new ArrayList<>();

        for (QnaBoardListResultSet result: resultSet) {
            QnaBoardSummary qnaBoardSummary = new QnaBoardSummary(result);

            qnaBoardList.add(qnaBoardSummary);
        }

        this.qnaBoardList = qnaBoardList;
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class QnaBoardSummary {
    public int qnaBoardNumber;
    public String qnaBoardTitle;
    public String qnaBoardWriteDatetime;
    public String qnaBoardWriterNickname;
    public String qnaBoardWriterProfileImageUrl;
    public boolean replyComplete;

    public QnaBoardSummary(QnaBoardListResultSet resultSet) {
        this.qnaBoardNumber = resultSet.getQnaBoardNumber();
        this.qnaBoardTitle = resultSet.getQnaBoardTitle();
        this.qnaBoardWriteDatetime = resultSet.getQnaBoardWriteDatetime();
        this.qnaBoardWriterNickname = resultSet.getQnaBoardWriterNickname();
        this.qnaBoardWriterProfileImageUrl = resultSet.getQnaBoardWriterProfileImageUrl();
        this.replyComplete = resultSet.getReplyComplete() == 1;
    }
}
