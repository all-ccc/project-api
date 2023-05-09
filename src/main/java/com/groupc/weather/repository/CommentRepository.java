package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.CommentEntity;


@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer>{
    
    List<CommentEntity> findByBoardNumber(int boardNumber);
    
}
