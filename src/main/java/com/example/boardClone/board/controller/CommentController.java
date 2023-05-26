package com.example.boardClone.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.boardClone.board.dto.CommentDTO;
import com.example.boardClone.board.service.CommentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/save")
    public @ResponseBody String save(@ModelAttribute CommentDTO commentDTO) {
        System.out.println("commentDTO = " + commentDTO);
        return "요청 성공";
    }
}
