package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.HashtagHasBoardEntity;
import com.groupc.weather.entity.primaryKey.HashPk;
@Repository
public interface HashtagHasBoardRepository extends JpaRepository<HashtagHasBoardEntity, HashPk> {
    
}
