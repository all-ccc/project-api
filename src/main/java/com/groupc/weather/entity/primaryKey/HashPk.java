package com.groupc.weather.entity.primaryKey;

import java.io.Serializable;
import javax.persistence.Column;
import lombok.Data;


@Data

public class HashPk implements Serializable {
    @Column(name = "hashtagNumber")
    private int hashtagNumber;
    @Column(name = "boardNumber")
    private int boardNumber;
    //private String hashtagContent;
    //private List<HashListEntity> hashList;
  
    // HashListEntity(PostBoardRequestDto dto){
    //     this.boardNumber = dto.getBoardNumber();
    // }
    // List<HashListEntity> HashListEntitiy(PostPhotoBoardRequestDto dto){}   연구해봅시다...
    //hashList.add(hashtageContent);
}
