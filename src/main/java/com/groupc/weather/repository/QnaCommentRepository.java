package com.groupc.weather.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.QnaCommentEntity;


@Repository
public interface QnaCommentRepository extends JpaRepository<QnaCommentEntity, Integer> {
    
    public QnaCommentEntity findByQnaCommentNumber(Integer qnaCommentNumber);
    public boolean existsByQnaCommentNumber(Integer qnaCommentNumber);
    @Transactional
    void deleteByCommentNumber(int qnaCommentNumber);
}
