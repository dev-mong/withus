package com.tgys.withus.service;

import com.tgys.withus.domain.BlindBoard;
import com.tgys.withus.repository.BlindRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlindService {
    private final BlindRepository blindRepository;

    public List<BlindBoard> findAll(){
        return blindRepository.findAll();
    }
}
