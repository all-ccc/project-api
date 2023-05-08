package com.groupc.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.Commententity;

@Repository
public interface CommentRepository extends JpaRepository<Commententity, Integer>{
    List<Commententity> findByBoardNumber(int boardNumber);
    
}
