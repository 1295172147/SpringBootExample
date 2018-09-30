//package com.example.springbootjpa.servicce.impl;
//
//import com.example.springbootjpa.entity.SysUser;
//import com.example.springbootjpa.servicce.UserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.Random;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//
//public class SysUserServiceImplTest {
//    @Resource
//    private UserService userService;
//
//    @Test
//    public void save(){
//        String[] names = {"AA","BB","CC","DD","EE"} ;
//        Random random = new Random() ;
//        for (int i = 0 ; i < 5; i ++ ){
//            SysUser sysUser = new SysUser();
//            sysUser.setNickname(names[i]);
//            sysUser.setFans(random.nextInt(30));
//            System.out.println(userService.save(sysUser));
//        }
//    }
//
//    @Test
//    public void getAll() throws Exception {
//
//    }
//
//    @Test
//    public void get() throws Exception {
//
//    }
//
//    @Test
//    public void delete() throws Exception {
//
//    }
//
//}
