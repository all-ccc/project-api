package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.primaryKey.HashListEntity;

public interface HashTageRepository extends JpaRepository<HashListEntity, Integer>{
    public HashListEntity findByBoardNumber(int boardNumber);
    
}