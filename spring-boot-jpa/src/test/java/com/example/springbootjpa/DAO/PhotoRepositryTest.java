package com.example.springbootjpa.DAO;


import com.example.springbootjpa.entity.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoRepositryTest {
    @Resource
    private PhotoRepositry photoRepositry;
    @Test
    public void initData(){
        Photo[] photos = {
                new Photo("帝国神纪","https://bookcover.yuewen.com/qdbimg/349573/1012637817/180"),
                new Photo("太平洋超级帝国","https://bookcover.yuewen.com/qdbimg/349573/1012625177/180"),
                new Photo("晋明","https://bookcover.yuewen.com/qdbimg/349573/1012899401/180"),
                new Photo("丐世奸雄","https://bookcover.yuewen.com/qdbimg/349573/1012803812/180"),
                new Photo("傲意凌云","https://bookcover.yuewen.com/qdbimg/349573/1012982019/180"),
                new Photo("冒牌韩信","https://bookcover.yuewen.com/qdbimg/349573/1012908928/180"),
                new Photo("帝国神纪","https://bookcover.yuewen.com/qdbimg/349573/1012637817/180"),
                new Photo("太平洋超级帝国","https://bookcover.yuewen.com/qdbimg/349573/1012625177/180")
        };
        for(int i=0;i<photos.length;i++){
            photoRepositry.save(photos[i]);
        }
    }

}