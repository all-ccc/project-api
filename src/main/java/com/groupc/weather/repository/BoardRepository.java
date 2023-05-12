package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.groupc.weather.entity.BoardEntity;
import com.groupc.weather.entity.resultSet.BoardCommentLikeyCountResultSet;
import com.groupc.weather.entity.resultSet.BoardCommentResultSet;
import com.groupc.weather.entity.resultSet.HashTagResultSet;
import com.groupc.weather.entity.resultSet.LikeyResultSet;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {

    public BoardEntity findByBoardNumber(int boardNumber);

    @Query(value =
    "SELECT " + 
    "B.board_number AS boardNumber, " +  
    "C.comment_number AS commentNumber, " +
    "C.user_number AS userNumber, " +  
    "C.content AS commentContent, " + 
    "C.write_datetime AS commentDatetime, " + 
    "C.user_nickname AS commentUserNickname, " +
    "C.user_profile_image_url AS commentUserProfileImageUrl, "+ 
    "FROM Board B, Comment C " +
    "Where B.board_number = C.board_number" +
    "GROUP BY B.board_number " +
    "ORDER BY C.write_datetime DESC",
    nativeQuery = true
)
public List<BoardCommentResultSet> getBoardCommentList();


@Query(value =
"SELECT " + 
"B.board_number AS boardNumber, " +
"B.title AS boardTitle, " +
"B.content AS boardContent, " +
"B.write_datetime AS boardWriterDatetime, " +
"B.weather_info AS weatherInfo, " +
"B.temperature AS temperature, " +
"B.view_count AS viewCount, " +
"U.nickname AS writerNickname, " +
"U.profile_image_url AS writerProfileImageUrl, " +
"count(DISTINCT C.comment_number) AS commentCount, " +
"count(DISTINCT L.user_number) AS likeCount " +
"FROM Board B, Comment C, Likey L, User U "  +
"Where B.board_number= C.board_number, " +
"AND B.user_number = U.user_number " +
"AND B.board_number = L.board_number" +
"GROUP BY B.board_number ",
nativeQuery = true
)
public List<BoardCommentLikeyCountResultSet> getBoardCommentLikeyList();


@Query(value =
"SELECT " + 
"B.board_number AS boardNumber, " +
"L.user_number AS userNumber, " +
"L.user_nickname AS userNickname, " +
"L.user_profile_image_url AS commentUserProfileImageUrl, "+
"GROUP BY B.board_number ",
nativeQuery = true
)
public List<LikeyResultSet> getLikeList();


@Query(value =
"SELECT " + 
"B.board_number AS boardNumber, " +
"H.hashtag_number AS hashtagNumber, " +
"H.hashtage_content AS hashTageContent, " +
"GROUP BY B.board_number ",
nativeQuery = true
)
public List<HashTagResultSet> getHashTagList();
}
