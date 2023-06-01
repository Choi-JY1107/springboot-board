package com.example.boardClone.board.dto;

import java.time.LocalDateTime;

import com.example.boardClone.board.entity.CommentEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentDTO {
    private Long id;
    private String commentWriter;
    private String commentContents;
    private Long boardId;
    private LocalDateTime commentCreatedTime;

    public static CommentDTO toCommentDTO(CommentEntity commentEntity, Long boardId) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(commentEntity.getId());
        commentDTO.setCommentWriter(commentEntity.getCommentWriter());
        commentDTO.setCommentContents(commentEntity.getCommentContents());
        commentDTO.setCommentCreatedTime(commentEntity.getCreatedTime());
        // 자식 Entity 가 부모 Entity 를 꺼내는 방식
        /* 만약 boardId가 없다면
        @Transactional
        commentDTO.setBoardId(commentEntity.getBoardEntity().getId());
         */
        commentDTO.setBoardId(boardId);

        return commentDTO;
    }
}
