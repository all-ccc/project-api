package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.QnaBoardCommentEntity;

public interface QnaBoardCommentRepository extends JpaRepository<QnaBoardCommentEntity, Integer> {
    
}
