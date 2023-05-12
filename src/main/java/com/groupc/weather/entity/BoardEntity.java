package com.groupc.weather.entity;

import com.groupc.weather.dto.request.board.PostPhotoBoardRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructorgsConstructor
@AllArgsConstructorr
@Entity(name = "PhotoBoard")
@Table(name = "Photo_Board")
public class BoardEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int boardNumber;
        private int userNumber;
        private String title;
        private String content;
        private String imageUrl;
        private String writeDatetime;
        private int temperature;
        private String weatherInfo;
        private int viewCount;
   

        public BoardEntity(PostPhotoBoardRequestDto dto) {
                Date now = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String writeDatetime = simpleDateFormat.format(now);

                this.boardNumber = dto.getBoardNumber();
                this.title = dto.getTitle();
                this.content = dto.getContent();
                this.imageUrl = dto.getImageUrl();
                this.weatherInfo = writeDatetime;
                this.viewCount = 0;
                
        }
}
 
