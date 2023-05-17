package com.groupc.weather.entity.resultSet;

public interface QnaBoardListResultSet {
    public int getBoardNumber();
    public String getBoardTitle();
    public String getBoardWriteDatetime();
    public int getBoardWriterNumber();
    public String getBoardWriterNickname();
    public String getBoardWriterProfileImageUrl();
    public boolean getReplyComplete();
}

