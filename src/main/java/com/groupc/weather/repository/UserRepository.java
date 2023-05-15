package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    public boolean existsByEmail(String email);
    public boolean existsByUserNumber(Integer userNumber);

    public boolean existsByNickname(String nickname);

    public boolean existsByPhoneNumber(String phoneNumber);

    public UserEntity findByEmail(String email);

    public UserEntity findByPassword(String password);

}
