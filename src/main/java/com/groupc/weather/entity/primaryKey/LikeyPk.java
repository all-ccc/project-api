package com.groupc.weather.entity.primaryKey;

import java.io.Serializable;
import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeyPk implements Serializable {
    @Column(name = "userNumber")
    private Integer userNumber;
    @Column(name = "boardNumber")
    private Integer boardNumber;
        
    
    
    public LikeyPk(LikeyPk likeyPk){
            this.userNumber=likeyPk.getUserNumber();
            this.boardNumber=likeyPk.getBoardNumber();

        }
    
    
}
