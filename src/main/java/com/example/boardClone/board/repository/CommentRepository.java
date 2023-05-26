package com.example.boardClone.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boardClone.board.entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}
