package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.ChattingMessageEntity;


@Repository
public interface ChattingMessageRepository extends JpaRepository<ChattingMessageEntity, Integer> {
    
    @Query(value =
    "SELECT * " +
    "FROM chatting_message " +
    "where " +
    "(room_id = :room_id) " +
    "and (user_number = :user_number) " +
    "and view = 0; ",
    nativeQuery = true
    )
    List<ChattingMessageEntity> findByNotViewList(@Param("room_id") String roomId,@Param("user_number") Integer userNumber);





}
