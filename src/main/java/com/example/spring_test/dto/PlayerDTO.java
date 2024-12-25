package com.example.spring_test.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class PlayerDTO {
    private Long playerId;
    private String profileImage;
    private String nickname;
    private String gameName;
    private String bio;
    private Long memberId;
}
