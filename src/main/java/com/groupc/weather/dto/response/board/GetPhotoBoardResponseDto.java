package com.groupc.weather.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.board.PostPhotoBoardRequestDto;
import com.groupc.weather.entity.CommentEntity;
import com.groupc.weather.entity.HashListEntity;
import com.groupc.weather.entity.ImageUrlEntity;
import com.groupc.weather.entity.LikyEntity;
import com.groupc.weather.entity.BoardEntity;
import com.groupc.weather.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPhotoBoardResponseDto extends ResponseDto {
    private int boardNumber;
    private String boardTitle;
    private String boardContent;
    private String boardWriteDatetime;
    private String weatherInfo;
    private int temperature;
    private int viewCount;
    private String boardWriterNickname;
    private String boardWriterProfileImageUrl;
    private int commentCount;
    private int likeCount;
    private List<Comment> commentList;
    private List<ImageUrlList> boardImageUrlList;
    private List<HashList> hashist;
    private List<Liky> likeList;

    // request 요청 하면 => dto => DB = > dto => response
    public GetPhotoBoardResponseDto(
            BoardEntity photoBoardEntity, UserEntity userEntity,
            List<LikyEntity> likyEntities, List<CommentEntity> commentEntities, List<HashListEntity> hashListEntities,
            List<ImageUrlEntity> imageUrlEntities) {
        super("SU", "Success");
        this.boardNumber = photoBoardEntity.getBoardNumber();
        this.boardTitle = photoBoardEntity.getTitle();
        this.boardContent = photoBoardEntity.getContent();
        this.boardWriteDatetime = photoBoardEntity.getWriteDatetime();
        this.weatherInfo = photoBoardEntity.getWeatherInfo();
        this.temperature = photoBoardEntity.getTemperature();
        this.viewCount = photoBoardEntity.getViewCount();
        this.boardWriterNickname = userEntity.getNickname();
        this.boardWriterProfileImageUrl = userEntity.getImage();
        this.commentCount = commentList.size();
        this.likeCount = likyList.size();

    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Comment {
    private String commentNumber;
    private String boardNumber;
    private int commentWriterNumber;
    private String commentContent;
    private String commentWriterNickname;
    private String commentWriterProfileImageUrl;
    private String commentWriteDatetime;

    Comment(CommentEntity commentEntity) {
        this.commentNumber = commentEntity.getCommentNumber();
        this.boardNumber = commentEntity.getBoardNumber();
        this.commentWriterNumber = commentEntity.getCommentWriterNumber();
        this.commentContent = commentEntity.getCommentContent();
        this.commentWriterNickname = commentEntity.getCommentWriterNickname();
        this.commentWriterProfileImageUrl = commentEntity.getCommentWriterProfileImageUrl();
        this.commentWriteDatetime = commentEntity.getCommentWriteDatetime();
    }

    static List<Comment> createList(List<CommentEntity> commentEntities) {
        List<Comment> commentList = new ArrayList<>();
        for (CommentEntity commentEntity : commentEntities) {
            Comment comment = new Comment(commentEntity);
            commentList.add(comment);

        }
        return commentList;
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Liky {
    private int boardNumber;
    private int userNumber;
    private String userNickname;
    private String userProfileImageUrl;

    Liky(LikyEntity likyEntity) {
        this.boardNumber = likyEntity.getBoardNumber();
        this.userNumber = likyEntity.getUserNumber();
        this.userNickname = likyEntity.getUserNickname();
        this.userProfileImageUrl = likyEntity.getUserProfileImageUrl();
    }

    static List<Liky> createList(List<LikyEntity> likyEntities) {
        List<Liky> likyList = new ArrayList<>();
        for (LikyEntity likyEntity : likyEntities) {
            Liky liky = new Liky(likyEntity);
            likyList.add(liky);

        }
        return likyList;

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class ImageUrl {

        private int imageNumber;
        private String imagUrl;
        private int boardNumber;

        ImageUrl(ImageUrlEntity imageUrlEntity) {
            this.imageNumber = imageUrlEntity.getImageNumber();
            this.imagUrl = imageUrlEntity.getImageUrl();
            this.boardNumber = imageUrlEntity.getBoardNumber();
        }
        static List<ImageUrl> createList(List<ImageUrlEntity> imageUrlEntities) {
            List<ImageUrl> imageUrlList = new ArrayList<>();
            for (ImageUrlEntity imageUrlEntity : imageUrlEntities) {
                ImageUrl imageUrl = new ImageUrl(imageUrlEntity);
                imageUrlList.add(imageUrl);
    
            }
            return imageUrlList;
    
        }
    }

@Data
@NoArgsConstructor
@AllArgsConstructor
class HashTag {
    private int hashtagNumber;
    private String hashtagContent;
    private int boardNumber;
   
    HashTag(BoardEntity boardentity, HashListEntity hashListEntity){
        this.hashtagContent = hashListEntity.getHashtagContent();
        this.hashtagNumber = hashListEntity.gethashtagNumber();
        this.boardNumber = boardentity.getBoardNumber();
    }
    static List<HashTag> createList(List<HashListEntity> hashTagEntities) {
        List<HashTag> hashList = new ArrayList<>();
        for (HashListEntity hashTagEntity : hashTagEntities) {
            HashTag hashTag = new HashTag(hashTagEntity);
            hashList.add(hashTag);

        }
        return hashList;

    }
}

}