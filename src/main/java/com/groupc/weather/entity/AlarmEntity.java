package com.groupc.weather.entity;

<<<<<<< HEAD
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


>>>>>>> f3607802f12e0498efe87a1f512488c2249a7e7a
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
public class AlarmEntity {
    private int AlarmNumber;
    private int userNumber;
    private String AlarmContent;
=======
@Entity(name="Alarm")
@Table(name="Alarm")
public class AlarmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int alarmNumber;
    private int userNumber;
    private String alarmContent;
>>>>>>> f3607802f12e0498efe87a1f512488c2249a7e7a
    
}
