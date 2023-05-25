package com.groupc.weather.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.groupc.weather.entity.LikeyEntity;
import com.groupc.weather.entity.primaryKey.LikeyPk;
@Repository
public interface LikeyRepository extends JpaRepository<LikeyEntity, LikeyPk> {


    @Query(
        value = 
        "SELECT * " + 
        "FROM Likey L " +
        "WHERE L.board_number = :boardNumber ",
        nativeQuery = true
    )
    public List<LikeyEntity> findByBoardNumberForLikeyList(@Param("boardNumber") int boardNumber);
    public List<LikeyEntity> findByBoardNumber(Integer boardNumber);


    @Transactional
    public void deleteById(LikeyPk likeyPk);
    
}
