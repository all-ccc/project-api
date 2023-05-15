package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.BoardEntity;

public interface PhotoBoardRepository extends JpaRepository<BoardEntity, Integer> {
    


}
