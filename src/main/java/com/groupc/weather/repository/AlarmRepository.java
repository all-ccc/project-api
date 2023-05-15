package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.AlarmEntity;

public interface AlarmRepository extends JpaRepository<AlarmEntity,Integer>  {
    
}
