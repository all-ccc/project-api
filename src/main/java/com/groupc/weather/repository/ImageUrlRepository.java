package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.ImageUrlEntity;

public interface ImageUrlRepository extends JpaRepository<ImageUrlEntity, Integer> {
    public ImageUrlEntity findByBoardNumber(int boardNumber);
}
