package com.groupc.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
<<<<<<< HEAD

    public boolean existsByEmail(String email);

    public boolean existsByNickname(String nickname);

    public boolean existsByPhoneNumber(String phoneNumber);

    public UserEntity findByEmail(String email);

    public UserEntity findByPassword(String password);

=======
    public boolean existsbyUserNumber(Integer userNumber);
    public boolean findByUserNumber(Integer userNumber);
>>>>>>> 284e26c5874ae950481a6ebd110f27b7b8cfc1f5
}
