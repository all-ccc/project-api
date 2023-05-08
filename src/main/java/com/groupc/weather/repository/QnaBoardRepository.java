package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.QnaBoardEntity;
import com.groupc.weather.entity.UserEntity;

@Repository
public interface QnaBoardRepository extends JpaRepository <QnaBoardEntity,Integer>{
    public boolean existsByBoardNumber(int boardnumber);




    public QnaBoardEntity findByBoardNumber(int boardnumber);
}
