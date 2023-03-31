package com.example.boardClone.board.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.boardClone.board.dto.BoardDTO;

import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

// DB의 테이블 역할을 하는 클래스
@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String boardWriter;

    @Column
    private String boardPass;

    @Column
    private String title;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContents(boardDTO.getBoardContents());
        boardEntity.setBoardHits(0);
        return boardEntity;
    }
}
