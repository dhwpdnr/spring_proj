package com.example.spring_test.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Data
public class MemberDTO {
    private Long memberId;
    private String username;
    private String password;
    private String phoneNumber;
    private String gender;
    private String nickname;
}
