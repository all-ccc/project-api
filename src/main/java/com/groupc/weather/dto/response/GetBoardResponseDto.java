package com.groupc.weather.dto.response;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.CommentEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBoardResponseDto extends ResponseDto{
    
    public GetBoardResponseDto() {

    }

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Comment {
    private int commentNumber;
    private int userNumber;
    private int managerNumber;
    private int boardNumber;
    private String commentWriterUserNickname;
    private String commentWriterManagerNickname;
    private String commentContent;
    private String commentWriteDatetime;
    private String commentWriterUserProfileImageUrl;
    private String commentWriterManagerProfileImageUrl;

    public Comment(CommentEntity commentEntity) {
         this.commentNumber = commentEntity.getCommentNumber();
         this.userNumber = commentEntity.getUserNumber();
         this.managerNumber = commentEntity.getManagerNumber();
         this.boardNumber = commentEntity.getBoardNumber();
         this.commentWriterUserNickname = commentEntity.getUserNickname();
         this.commentWriterManagerNickname = commentEntity.getManagerNickname();
         this.commentContent = commentEntity.getCommentContent();
         this.commentWriteDatetime = commentEntity.getWriteDatetime();
         this.commentWriterUserProfileImageUrl = commentEntity.getUserProfileImageUrl();
         this.commentWriterManagerProfileImageUrl = commentEntity.getManagerProfileImageUrl();

    }
}
}
