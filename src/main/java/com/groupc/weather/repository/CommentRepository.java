package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.CommentEntity;


@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer>{

    //게시물에 대한 댓글 목록
    List<CommentEntity> findByBoardNumber(Integer boardNumber);

    //게시물에 대한 댓글 삭제
    List<CommentEntity> deleteByBoardNumber(Integer commentNumber);

    
}
