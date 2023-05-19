package com.example.boardClone.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boardClone.board.entity.BoardFileEntity;

public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {

}
