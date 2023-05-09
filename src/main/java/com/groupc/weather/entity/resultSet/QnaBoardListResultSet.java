package com.groupc.weather.entity.resultSet;

public interface QnaBoardListResultSet {
    public int getQnaBoardNumber();
    public String getQnaBoardTitle();
    public String getQnaBoardWriteDatetime();
    public String getQnaBoardWriterNickname();
    public String getQnaBoardWriterProfileImageUrl();
    public boolean getCommentComplete();
}
