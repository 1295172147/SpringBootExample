package com.example.springbootjpa.servicce;

import com.example.springbootjpa.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumServiceTest {

    @Resource
    private AlbumService albumService;

    @Test
    public void findOne() {
        Album album = albumService.findOne(1);
        System.out.println(album);
    }

    @Test
    public void getHotAlbums() {
    }
}