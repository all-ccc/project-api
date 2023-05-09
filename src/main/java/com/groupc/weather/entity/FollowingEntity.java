package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// test
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Following")
@Table(name = "Following")
public class FollowingEntity {

    @Id
    private int followerNumber;
    @Id
    private int followingNumber;

}
