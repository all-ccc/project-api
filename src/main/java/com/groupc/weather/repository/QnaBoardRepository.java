package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.QnaBoardEntity;
import com.groupc.weather.entity.resultSet.QnaBoardListResultSet;

public interface QnaBoardRepository extends JpaRepository<QnaBoardEntity, Integer> {
    public List<QnaBoardListResultSet> getQnaBoardList();
    public boolean existsByQnaBoardNumber(int QnaboardNumber);
    public QnaBoardEntity findByQnaBoardNumber(int qnaBoardNumber);
}
