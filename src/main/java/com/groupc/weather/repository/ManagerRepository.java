package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.ManagerEntity;

public interface ManagerRepository extends JpaRepository<ManagerEntity,Integer> {
    
    public boolean existsbyManagerNumber(Integer userNumber);
    public ManagerEntity findByManagerNumber(Integer managerNumber);
}
