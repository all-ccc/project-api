package com.groupc.weather.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.ChattingRoomEntity;
import com.groupc.weather.entity.primaryKey.ChattingRoomPk;

@Repository
public interface ChattingRoomRepository extends JpaRepository<ChattingRoomEntity, ChattingRoomPk> {
    public boolean existsByRoomId(String roomId);
    public List<ChattingRoomEntity> findByRoomId(String roomId);
    public List<ChattingRoomEntity> findByUserNumber(Integer userNumber);
    // public ChattingRoomEntity findByChattingPk(ChattingRoomPk chattingRoomPk);
   
    @Transactional
    public void deleteById(ChattingRoomPk chattingRoomPk);
   
    
}
