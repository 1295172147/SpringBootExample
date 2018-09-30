package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.Album;
import com.example.springbootjpa.servicce.AlbumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/{id}")
public class AlbumController {
    @Resource
    private AlbumService albumService;

    @GetMapping("/list")
    public List<Album> getAlbums() {
        return albumService.getHotAlbums();
    }

    @GetMapping(value = "/{id}")
    public Album getOne(@PathVariable("id") Integer id){
        return albumService.findOne(id);
    }
}
