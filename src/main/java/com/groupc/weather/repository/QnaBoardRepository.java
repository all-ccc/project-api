package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.QnaBoardEntity;

public interface QnaBoardRepository extends JpaRepository<QnaBoardEntity, Integer> {
    
}
