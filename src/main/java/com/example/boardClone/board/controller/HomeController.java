package com.example.boardClone.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // url에서 역슬래시를 보면 실행되도록 하는 어노테이션
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
