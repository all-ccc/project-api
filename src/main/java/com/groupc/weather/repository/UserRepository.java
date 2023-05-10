package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    

    public boolean existsbyUserNumber(Integer userNumber);
    public UserEntity findByUserNumber(Integer userNumber);

}
