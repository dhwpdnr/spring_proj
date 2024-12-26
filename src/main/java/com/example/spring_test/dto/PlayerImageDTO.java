package com.example.spring_test.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class PlayerImageDTO {
    private Long id;
    private Long playerId;
    private String originalFileName;
    private String storedFileName;
}
