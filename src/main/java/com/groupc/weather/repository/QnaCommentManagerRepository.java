package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.ManagerEntity;
import com.groupc.weather.entity.QnaCommentManagerEntity;


@Repository
public interface QnaCommentManagerRepository extends JpaRepository<QnaCommentManagerEntity, Integer> {
    
}
