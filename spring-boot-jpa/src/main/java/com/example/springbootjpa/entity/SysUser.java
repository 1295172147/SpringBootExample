//package com.example.springbootjpa.entity;
//
//
//import lombok.Data;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
///**
// * @author asus
// */
//@Entity
//@Data
//public class SysUser {
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column(nullable = false)
//    private String account;
//
//    @Column(nullable = false)
//    private String password;
//
//    private String nickname;
//
//    private Integer fans;
//
//
//    public SysUser(String account, String password, String nickname, Integer fans) {
//        this.account = account;
//        this.password = password;
//        this.nickname = nickname;
//        this.fans = fans;
//    }
//
//    public SysUser() {
//    }
//}