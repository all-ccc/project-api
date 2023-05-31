package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.ChattingMessageEntity;
@Repository
public interface ChattingMessageRepository extends JpaRepository<ChattingMessageEntity, Integer> {
    
}
