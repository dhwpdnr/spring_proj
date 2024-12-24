package com.example.spring_test.repository;

import com.example.spring_test.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final SqlSessionTemplate sql;

    public boolean checkDuplicate(MemberDTO memberDTO) {
        int count = sql.selectOne("Member.checkDuplicate", memberDTO);
        return count > 0;
    }


    public void signup(MemberDTO memberDTO) {
        if (checkDuplicate(memberDTO)) {
            throw new IllegalArgumentException("아이디나 닉네임이 중복 되었습니다.");
        }
        sql.insert("Member.signup", memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO) {
        return sql.selectOne("Member.login", memberDTO);
    }

}
