package com.example.spring_test.service;

import com.example.spring_test.dto.MemberDTO;
import com.example.spring_test.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void signup(MemberDTO memberDTO) {
        memberRepository.signup(memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO) {
        MemberDTO result = memberRepository.login(memberDTO);
        if (result == null) {
            throw new IllegalArgumentException("로그인 실패");
        }
        return result;
    }
}
