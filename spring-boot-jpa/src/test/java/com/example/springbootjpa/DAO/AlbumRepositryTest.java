package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositryTest {
    @Resource
    private AlbumRepositry albumRepositry;
    @Test
    public void initData() {
        Album[] albums = {
                new Album("https://bookcover.yuewen.com/qdbimg/349573/1012637817/180",
                        "帝国神纪",
                        "醒掌天下权，醉卧美人膝，五千年风华烟雨，是非成败转头空！",
                        2772,
                        "本天成"),
                new Album("https://bookcover.yuewen.com/qdbimg/349573/1012625177/180",
                        "太平洋超级帝国",
                        "我要成为海贼王的男人！哦！不对！我要征服整个美洲，澳洲，将太平洋作为自己帝国的内湖！",
                        2442,
                        "古风飞"),
                new Album("https://bookcover.yuewen.com/qdbimg/349573/1012899401/180",
                        "晋明",
                        "一位林家村的青年，因为一纸婚约，被迫踏入了这波诡云谲的大势之中……\n" +
                                "一樽清酒，一曲高歌，一众佳人，一段传说。",
                        1234,
                        "鸣启"),
                new Album("https://bookcover.yuewen.com/qdbimg/349573/1012803812/180",
                        "丐世奸雄",
                        "我不做那盖世的英雄，只做随心所欲的奸雄！",
                        3456,
                        "理发的小强2"),
                new Album("https://bookcover.yuewen.com/qdbimg/349573/1012982019/180",
                        "傲意凌云",
                        "形意拳宗师杨童禧，穿越至史上头一个大一统的大秦皇朝。",
                        345,
                        "娜泉慕云"),
                new Album("https://bookcover.yuewen.com/qdbimg/349573/1012908928/180",
                        "冒牌韩信",
                        "大争之世，看冒牌韩信凭借游戏系统，收集历史名人，和不同时空的帝王人杰交战 ",
                        23456,
                        "凤凰村长")
        };
        for (int i=0;i<6;i++){
            albumRepositry.save(albums[i]);
        }
    }

    @Test
    public void findHotAlbums() {
        List<Album> albumList = albumRepositry.findHotAlbums();
        albumList.forEach(album -> System.out.println(album));
    }
}