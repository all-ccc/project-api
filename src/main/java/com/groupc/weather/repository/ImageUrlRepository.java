package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.ImageUrlEntity;
@Repository
public interface ImageUrlRepository extends JpaRepository<ImageUrlEntity, Integer> {
    public ImageUrlEntity findByBoardNumber(int boardNumber);
}
