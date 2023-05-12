package com.groupc.weather.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupc.weather.common.util.CustomResponse;
import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.dto.request.common.ManagerDto;
import com.groupc.weather.dto.request.common.UserDto;
import com.groupc.weather.dto.request.qnaBoard.PostQnaCommentRequestDto;
import com.groupc.weather.entity.ManagerEntity;
import com.groupc.weather.entity.QnaCommentEntity;

import com.groupc.weather.entity.UserEntity;
import com.groupc.weather.repository.ManagerRepository;
import com.groupc.weather.repository.QnaBoardRepository;
import com.groupc.weather.repository.QnaCommentRepository;
import com.groupc.weather.repository.UserRepository;
import com.groupc.weather.service.QnaCommentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QnaCommentServiceImplement implements QnaCommentService {
    private final QnaBoardRepository qnaBoardRepsitory;
    private final UserRepository userRepositry;
    private final QnaCommentRepository qnaCommentRepository;
    private final ManagerRepository managerRepository;

    @Override
    public ResponseEntity<ResponseDto> postQnaComment(PostQnaCommentRequestDto dto) {
        ResponseDto body = null;
        // qna 댓글 작성자하고 싶은 사람 특정
        int qnaCommentWriterNumber = dto.getWriterNumber();
        // qna 보드 특정
        int qnaBoardNumber = dto.getQnaBoardNumber();
        // qna 글 작성자 특정
        int qnaBoardWriterNumber = qnaBoardRepsitory.findByQnaBoardNumber(dto.getQnaBoardNumber()).getUserNumber();

        try {
            boolean existedWriterManagerNumber = managerRepository.existsbyManagerNumber(qnaBoardWriterNumber);
            boolean existedWriterUserNumber = userRepositry.existsbyUserNumber(qnaBoardWriterNumber);
            boolean existedQnaBoardNumber = qnaBoardRepsitory.existsByQnaBoardNumber(qnaBoardNumber);

            // TODO: Qna 존재 유무
            if (!existedQnaBoardNumber) {
                return CustomResponse.notExistBoardNumber();
            }
            // TODO: 사용자 존재 유무 및 사용자 판단.
            if (!(existedWriterManagerNumber || existedWriterUserNumber)) {
                return CustomResponse.notExistUserNumber();
            }
            // TODO: 관리자가 아닌데 작성자도 아닐 경우
            if (!existedWriterManagerNumber) {
                if (!(qnaBoardWriterNumber == qnaCommentWriterNumber)) {
                    return CustomResponse.noPermissions();
                }
                // todo: 작성자가 맞을 경우
                UserEntity userEntity = userRepositry.findByUserNumber(dto.getWriterNumber());
                UserDto userDto = new UserDto();
                userDto.setUserNickname(userEntity.getUserNickname());
                userDto.setUserProfileImageUrl(userEntity.getProfileImageUrl());

                QnaCommentEntity qnaCommentEntity = new QnaCommentEntity(dto, userDto);
                qnaCommentRepository.save(qnaCommentEntity);

                return CustomResponse.success();
            }

            // TODO: 관리자일 경우
            ManagerEntity managerEntity = managerRepository.findByManagerNumber(dto.getWriterNumber());
            ManagerDto managerDto = new ManagerDto();
            managerDto.setManagerNickname(managerEntity.getManagerNickname());
            managerDto.setManagerProfileImageUrl(managerEntity.getProfileImageUrl());
            QnaCommentEntity qnaCommentEntity = new QnaCommentEntity(dto, managerDto);
            qnaCommentRepository.save(qnaCommentEntity);

            // TODO:

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return CustomResponse.success();
    }

}
