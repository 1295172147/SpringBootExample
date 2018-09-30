package com.example.springbootjpa.servicce.impl;

import com.example.springbootjpa.DAO.AlbumRepositry;
import com.example.springbootjpa.entity.Album;
import com.example.springbootjpa.servicce.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Service
public class AlbumServiceImpl implements AlbumService{
    @Resource
    AlbumRepositry albumRepositry;

//    @Override
//    public List<Album>findAll(){
//        return albumRepositry.findAll();
//    }
//
//    @Override
//    public Album findId(Integer id) {
////        return albumRepositry.findId(id).get;
//        return null;
//    }

    @Override
    public Album findOne(Integer id) {
        return albumRepositry.findById(id).get();    }

    @Override
    public List<Album> getHotAlbums() {
        return albumRepositry.findHotAlbums();
    }

}
