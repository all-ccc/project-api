package com.groupc.weather.entity.resultSet;

import java.util.List;

public interface GetBoardListResult {
    public int getBoardNumber();
    public String getBoardTitle();
    public String getBoardContent();
    public String getBoardfirstImageUrl();
    public String getBoardWriterDatetime();
    public String getBoardWriterNickname();
    public String getboardWriterProfileImageUrl();

    public int getCommentCount();
    public int getLikeCount();
    public List<HashTagResultSet> gethashTagList();
}
