package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.groupc.weather.entity.ImageUrlEntity;

public interface ImageUrlRepository extends JpaRepository<ImageUrlEntity, Integer> {
    
    public List<ImageUrlEntity> findByBoardNumber(int boardNumber);
    public ImageUrlEntity findByBoardNumberAndImageNumber(int boardNumber, int imageNumber);
}
