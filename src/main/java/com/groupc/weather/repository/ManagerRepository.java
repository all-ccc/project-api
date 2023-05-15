package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.ManagerEntity;

public interface ManagerRepository extends JpaRepository<ManagerEntity,Integer> {
    
    public boolean existsbyManagerNumber(Integer managerNumber); //Integer userNumber 이렇게 되어있길래 managerNumber로 바꿈
    public boolean findByManagerNumber(Integer managerNumber);
}
