package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
<<<<<<< HEAD
    // 유저의 중복 정보가 있는가?
    // Service Implement에서 사용할 예정. ( 유저 등록 )
    public boolean existsByEmail(String email);

    public boolean existsByNickname(String nickname);

    public boolean existsByPhoneNumber(String phoneNumber);
=======
    

    public boolean existsbyUserNumber(Integer userNumber);
    public UserEntity findByUserNumber(Integer userNumber);
>>>>>>> d3a2ffce6525bc2345521792edfb88ca62816e07

}
