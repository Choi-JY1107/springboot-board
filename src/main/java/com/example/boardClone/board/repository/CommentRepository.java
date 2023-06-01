package com.example.boardClone.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boardClone.board.entity.BoardEntity;
import com.example.boardClone.board.entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    // select * from comment_table where board_id=? order by id desc;
    List<CommentEntity> findAllByBoardEntityOrderByIdDesc(BoardEntity boardEntity);

}