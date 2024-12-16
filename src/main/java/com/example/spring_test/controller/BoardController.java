package com.example.spring_test.controller;

import com.example.spring_test.dto.BoardDTO;
import com.example.spring_test.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String save(BoardDTO boardDTO) {
        System.out.println("BordDTO = " + boardDTO);
        boardService.save(boardDTO);
        return "index";
    }
}
