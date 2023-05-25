package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.groupc.weather.entity.CommentEntity;
import com.groupc.weather.entity.UserEntity;


@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer>{

    public CommentEntity findByUserNumber(Integer userNumber);
    //게시물에 대한 댓글 목록

    
    public List<CommentEntity> findByBoardNumber(Integer boardNumber);

    //게시물에 대한 댓글 삭제
    public List<CommentEntity> deleteByBoardNumber(Integer commentNumber);

    @Transactional
    void deleteByCommentNumber(int commentNumber);

     
}
