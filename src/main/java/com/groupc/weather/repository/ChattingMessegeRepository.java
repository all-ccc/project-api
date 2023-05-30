package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.ChattingMessegeEntity;
@Repository
public interface ChattingMessegeRepository extends JpaRepository<ChattingMessegeEntity, Integer> {
    
}
