package com.groupc.weather.repository;

<<<<<<< HEAD
public interface LikeyRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.groupc.weather.entity.LikeyEntity;
import com.groupc.weather.entity.primaryKey.LikeyPk;

public interface LikeyRepository extends JpaRepository<LikeyEntity, LikeyPk> {
>>>>>>> c8c0d8ab7ca7b758a306bc76cbd7479b1c3acde1
    
}
