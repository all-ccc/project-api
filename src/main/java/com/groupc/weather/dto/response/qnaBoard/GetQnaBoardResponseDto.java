package com.groupc.weather.dto.response.qnaBoard;

import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.response.ResponseDto;
import com.groupc.weather.entity.ManagerEntity;
import com.groupc.weather.entity.QnaBoardCommentEntity;
import com.groupc.weather.entity.QnaBoardEntity;
import com.groupc.weather.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetQnaBoardResponseDto extends ResponseDto {
    private int qnaBoardNumber;
    private String qnaBoardTitle;
    private String qnaBoardContent;
    private String qnaBoardImageUrl;
    private String qnaBoardWriteDatetime;
    private String qnaBoardWriterNickname;
    private String qnaBoardWriterProfileImageUrl;
    private List<Comment> commentList;

    public GetQnaBoardResponseDto(
        QnaBoardEntity qnaBoardEntity, UserEntity userEntity,
        ManagerEntity managerEntity, List<QnaBoardCommentEntity> qnaBoardCommentEntities
    ) {
        super("SU", "Success");

        this.qnaBoardNumber = qnaBoardEntity.getQnaBoardNumber();
        this.qnaBoardTitle = qnaBoardEntity.getTitle();
        this.qnaBoardContent = qnaBoardEntity.getContent();
        this.qnaBoardImageUrl = qnaBoardEntity.getImageUrl();
        this.qnaBoardWriteDatetime = qnaBoardEntity.getWriteDatetime();
        this.qnaBoardWriterNickname = userEntity.getNickname();
        this.qnaBoardWriterProfileImageUrl = userEntity.getProfileImageUrl();
        this.commentList = Comment.createList(qnaBoardCommentEntities);
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Comment {
    private int qnaCommentNumber;
    private int qnaBoardNumber;
    private int userNumber;
    private int managerNumber;
    private String userProfileImageUrl;
    private String managerProfileImageUrl;
    private String userNickname;
    private String managerNickname;
    private String content;
    private String writeDatetime;

    Comment(QnaBoardCommentEntity qnaBoardCommentEntity) {
        this.qnaCommentNumber = qnaBoardCommentEntity.getQnaCommentNumber();
        this.qnaBoardNumber = qnaBoardCommentEntity.getQnaBoardNumber();
        this.userNumber = qnaBoardCommentEntity.getUserNumber();
        this.managerNumber = qnaBoardCommentEntity.getManagerNumber();
        this.userProfileImageUrl = qnaBoardCommentEntity.getUserProfileImageUrl();
        this.managerProfileImageUrl = qnaBoardCommentEntity.getManagerProfileImageUrl();
        this.userNickname = qnaBoardCommentEntity.getUserNickname();
        this.managerNickname = qnaBoardCommentEntity.getManagerNickname();
        this.content = qnaBoardCommentEntity.getContent();
        this.writeDatetime = qnaBoardCommentEntity.getWriteDatetime();
    }

    static List<Comment> createList(List<QnaBoardCommentEntity> qnaBoardCommentEntities) {
        List<Comment> commentList = new ArrayList<>();
        for (QnaBoardCommentEntity qnaBoardCommentEntity: qnaBoardCommentEntities) {
            Comment comment = new Comment(qnaBoardCommentEntity);
            commentList.add(comment);
        }
        return commentList; // 다시 보기
    }
}
