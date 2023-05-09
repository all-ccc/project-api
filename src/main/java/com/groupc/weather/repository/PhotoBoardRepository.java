package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.PhotoBoardEntity;

public interface PhotoBoardRepository extends JpaRepository<PhotoBoardEntity, Integer> {
    
}
