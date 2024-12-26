package com.example.spring_test.controller;

import com.example.spring_test.dto.MemberDTO;

import com.example.spring_test.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final MemberService memberService;
//    private final PlayerService playerService;

    public static class ApiResponse {
        private String msg;

        public ApiResponse(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    @PostMapping("/auth/signup")
    public ResponseEntity<Object> signupAPI(@RequestBody MemberDTO memberDTO) {
        try {
            memberService.signup(memberDTO);
            return ResponseEntity.ok(new ApiResponse("success"));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(new ApiResponse(e.getMessage()));
        }
    }

    @PostMapping("/auth/login")
    public ResponseEntity<Object> loginAPI(@RequestBody MemberDTO memberDTO) {
        try {
            MemberDTO loggedInMember = memberService.login(memberDTO);
            return ResponseEntity.ok(loggedInMember);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(new ApiResponse(e.getMessage()));
        }
    }
}
