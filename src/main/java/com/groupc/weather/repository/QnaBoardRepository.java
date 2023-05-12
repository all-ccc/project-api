package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.groupc.weather.entity.QnaBoardEntity;
import com.groupc.weather.entity.resultSet.QnaBoardListResultSet;

public interface QnaBoardRepository extends JpaRepository<QnaBoardEntity, Integer> {
    public boolean existsByQnaBoardNumber(int QnaboardNumber);
    public QnaBoardEntity findByQnaBoardNumber(int qnaBoardNumber);

    @Query( // 일단 씀
        value = 
        "SELECT " + 
        "Q.board_number AS boardNumber," +
        "Q.title AS boardTitle," +
        "Q.write_datetime AS boardWriteDatetime," +
        "U.user_number AS boardWriterNumber," +
        "U.nickname AS boardWriterNickname," +
        "U.profile_image_url AS boardWriterProfileImageUrl," +
        "Q.reply_complete AS replyComplete " +
        "FROM User U, Qna_Board Q, Qna_Comment C " +
        "WHERE Q.board_number = C.qna_board_number " +
        "AND Q.user_number = U.user_number " +
        "AND C.manager_number " +
        "GROUP BY Q.board_number " +
        "ORDER BY Q.write_datetime DESC ",
        nativeQuery = true
    )
    public List<QnaBoardListResultSet> getQnaBoardList();
}
