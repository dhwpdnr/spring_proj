package com.example.spring_test.controller;

import com.example.spring_test.dto.BoardDTO;
import com.example.spring_test.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final BoardService boardService;

    @GetMapping("/list")
    public List<BoardDTO> showListPage() {
        List<BoardDTO> boardDTOList = boardService.findAll();
        return boardDTOList;

    }
}
