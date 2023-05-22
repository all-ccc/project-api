package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.groupc.weather.entity.primaryKey.HashPk;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "HashtagHasBoard")
@Table(name = "Hashtag_Has_Board")
@IdClass(HashPk.class)
public class HashtagHasBoardEntity {
    @Id
    private int hashtagNumber;
    @Id
    private int boardNumber;
}
