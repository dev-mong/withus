package com.tgys.withus.controller;

import com.tgys.withus.domain.BlindBoard;
import com.tgys.withus.service.BlindService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlindBoardController {
    private final BlindService blindService;

    @GetMapping("/test")
    public List<BlindBoard> testController(){
        return blindService.findAll();
    }
}
