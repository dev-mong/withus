package com.tgys.withus.dto;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_member_info")
@Getter
@Setter
@ToString
public class MemberInfo {
    
    //uuid 
    @Id
    @Column
    @GeneratedValue
    private String uniqId;

    //아이디
    @Column(nullable = false)
    private String id;
    
    //비밀번호
    @Column(nullable = false)
    private String password;

    //이메일
    @Column(nullable = false)
    private String email; 

    //가입일
    @Column
    @CreationTimestamp
    private String regDate; 
    



}
