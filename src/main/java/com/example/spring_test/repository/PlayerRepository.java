package com.example.spring_test.repository;

import com.example.spring_test.dto.PlayerDTO;
import com.example.spring_test.dto.PlayerImageDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PlayerRepository {

    private final SqlSessionTemplate sql;

//    public PlayerDTO save(PlayerDTO playerDTO) {
//        sql.insert("CombinedMapper.save", playerDTO);
//        return playerDTO;
//    }
//
//    public void saveFile(PlayerImageDTO playerImageDTO) {
//        sql.insert("Player.saveFile", playerImageDTO);
//    }
}
