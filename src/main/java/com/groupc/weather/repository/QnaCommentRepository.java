package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.QnaCommentEntity;


@Repository
public interface QnaCommentRepository extends JpaRepository<QnaCommentEntity, Integer> {
    

}
