package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.groupc.weather.entity.ImageUrlEntity;

public interface ImageUrlRepository extends JpaRepository<ImageUrlEntity, Integer> {
    
    public static List<ImageUrlEntity> findByBoardNumber(int boardNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByBoardNumber'");
    }
    public ImageUrlEntity findByImageNumber(int imageNumber);
    public ImageUrlEntity findByBoardNumberAndImageNumber(int boardNumber, int imageNumber);
}
