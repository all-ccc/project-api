package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.ManagerEntity;

public interface ManagerRepository extends JpaRepository<ManagerEntity, Integer> {
    
}
