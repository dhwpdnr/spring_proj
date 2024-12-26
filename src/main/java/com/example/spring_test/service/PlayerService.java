package com.example.spring_test.service;

import com.example.spring_test.dto.PlayerDTO;
import com.example.spring_test.dto.PlayerImageDTO;
import com.example.spring_test.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

//    public PlayerDTO save(PlayerDTO playerDTO) throws IOException {
//        if (playerDTO.getProfileImage().isEmpty()) {
//            return playerRepository.save(playerDTO);
//
//        } else {
//            PlayerDTO savedPlayer = playerRepository.save(playerDTO);
//
//            MultipartFile profileImage = playerDTO.getProfileImage();
//
//            String originalFilename = profileImage.getOriginalFilename();
//            System.out.println("originalFilename = " + originalFilename);
//
//            System.out.println(System.currentTimeMillis());
//            String storedFileName = System.currentTimeMillis() + "-" + originalFilename;
//            System.out.println("storedFileName = " + storedFileName);
//
//            PlayerImageDTO playerImageDTO = new PlayerImageDTO();
//            playerImageDTO.setOriginalFileName(originalFilename);
//            playerImageDTO.setStoredFileName(storedFileName);
//            playerImageDTO.setPlayerId(savedPlayer.getPlayerId());
//
//            String savePath = "/Users/codingrecipe/development/intellij_community/spring_upload_files/" + storedFileName; // mac
//            profileImage.transferTo(new File(savePath));
//            // board_file_table 저장 처리
//            playerRepository.saveFile(playerImageDTO);
//            return savedPlayer;
//        }
//    }
}
