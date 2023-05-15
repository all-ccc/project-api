package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.QnaCommentEntity;
import com.groupc.weather.entity.UserEntity;

@Repository
public interface QnaCommentRepository extends JpaRepository<QnaCommentEntity, Integer> {
    

}
