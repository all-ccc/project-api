package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.LikeyEntity;
import com.groupc.weather.entity.primaryKey.LikeyPk;

public interface LikeyRepository extends JpaRepository<LikeyEntity, LikeyPk> {
    
}
