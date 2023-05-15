package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.QnaCommentEntity;
<<<<<<< HEAD
import com.groupc.weather.entity.UserEntity;

@Repository
public interface QnaCommentRepository extends JpaRepository<QnaCommentEntity, Integer> {
    
=======


@Repository
public interface QnaCommentRepository extends JpaRepository<QnaCommentEntity, Integer> {

    List<QnaCommentEntity> findByQnaBoardNumber(int qnaBoardNumber);
>>>>>>> f3607802f12e0498efe87a1f512488c2249a7e7a

}
