package com.groupc.weather.entity.resultSet;

import java.util.List;

public interface GetBoardListResult {
    public int getBoardNumber();
    public String getBoardTitle();
    public String getBoardContent();
    public String getBoardWriteDatetime();
    public String getBoardWriterNickname();
    public String getBoardWriterProfileImageUrl();
    public int getCommentCount();
    public int getLikeCount();
}
