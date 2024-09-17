package com.tgys.withus.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BlindBoard {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Idx;
    private String title;
    private String contents;
    private String userName;
}
