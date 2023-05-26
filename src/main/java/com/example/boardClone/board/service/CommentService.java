package com.example.boardClone.board.service;

import org.springframework.stereotype.Service;

import com.example.boardClone.board.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
}
