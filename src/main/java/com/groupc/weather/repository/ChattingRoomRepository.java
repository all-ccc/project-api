package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.ChattingRoomEntity;
import com.groupc.weather.entity.primaryKey.ChattingRoomPk;

@Repository
public interface ChattingRoomRepository extends JpaRepository<ChattingRoomEntity, ChattingRoomPk> {
    public boolean existsByRoomNumber(Integer roomId);
   
    
}
