package com.groupc.weather.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.common.util.CustomResponse;
import com.groupc.weather.dto.request.qnaBoard.PostQnaCommentRequestDto;
import com.groupc.weather.dto.response.ResponseDto;
import com.groupc.weather.entity.QnaCommentManagerEntity;
import com.groupc.weather.entity.QnaCommentUserEntity;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.QnaBoardRepository;
import com.groupc.weather.repository.QnaCommentManagerRepository;
import com.groupc.weather.repository.QnaCommentUserRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.QnaCommentService;
import com.mysql.cj.protocol.x.Ok;

@Service
public class QnaCommentServiceImplement implements QnaCommentService {
    private QnaBoardRepository qnaBoardRepsitory;
    private UserRepository userRepositry;
    private QnaCommentUserRepository qnaCommentUserRepository;
    private QnaCommentManagerRepository qnaCommentManagerRepository;
    private ManagerRepository managerRepository;

    @Autowired
    public QnaCommentServiceImplement(QnaBoardRepository qnaBoardRepsitory, UserRepository userRepositry, ManagerRepository managerRepository,
            QnaCommentUserRepository qnaCommentUserRepository, QnaCommentManagerRepository qnaCommentManagerRepository) {
        this.qnaBoardRepsitory = qnaBoardRepsitory;
        this.userRepositry = userRepositry;
        this.managerRepository = managerRepository;
        this.qnaCommentUserRepository = qnaCommentUserRepository;
        this.qnaCommentManagerRepository = qnaCommentManagerRepository;

    }

    @Override
    public ResponseEntity<ResponseDto> postQnaComment(PostQnaCommentRequestDto dto) {
        ResponseDto body = null;
        String qnaCommentWriterEmail = dto.getWriterEmail();
        int qnaBoardNumber = dto.getQnaBoardNumber();
        int qnaBoardWriterNumber = qnaBoardRepsitory.findByBoardNumber(qnaBoardNumber).getWriterNumber();
    
        try {
            boolean existedWriterManagerEmail = managerRepository.existsByEmail(qnaCommentWriterEmail);
            boolean existedWriterUserEmail = userRepositry.existsByEmail(qnaCommentWriterEmail);
            boolean existedQnaBoardNumber = qnaBoardRepsitory.existsByBoardNumber(qnaBoardNumber);
            
            
            // TODO: Qna 존재 유무  
            if(!existedQnaBoardNumber){
                return CustomResponse.notExistBoardNumber();
            }

            // TODO: 사용자 존재 유무 및 사용자 판단.
            if(!(existedWriterManagerEmail&&existedWriterUserEmail)){
                    return CustomResponse.notExistUserEmail();
            }
            // TODO: 관리자가 아닌데 작성자도 아닐 경우
            if(existedWriterUserEmail){
                int qnaCommentWriterNumber = userRepositry.findByEmail(qnaCommentWriterEmail).getUserNumber();
                if(!(qnaBoardWriterNumber == qnaCommentWriterNumber)){
                    return CustomResponse.noPermissions();
                }
                //todo: 작성자가 맞을 경우
                QnaCommentUserEntity qnaCommentUserEntity = new QnaCommentUserEntity(dto);
                qnaCommentUserRepository.save(qnaCommentUserEntity);

                return CustomResponse.success();
            }

                //TODO: 관리자일 경우
            
            QnaCommentManagerEntity qnaCommentManagerEntity = new QnaCommentManagerEntity(dto);
            qnaCommentManagerRepository.save(qnaCommentManagerEntity);
          
            // TODO:

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return CustomResponse.success();
    }

}
