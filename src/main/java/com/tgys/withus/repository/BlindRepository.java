package com.tgys.withus.repository;

import com.tgys.withus.domain.BlindBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlindRepository extends JpaRepository<BlindBoard, Long> {
}
