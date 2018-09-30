package com.example.springbootjpa.servicce;

import com.example.springbootjpa.entity.Album;

import java.util.List;

/**
 * @author asus
 */
public interface AlbumService {

//    List<Album>findAll();
//
//    /**
//     * 根据id查找
//     * @param id
//     * @return
//     */
//    Album findId(Integer id);
    Album findOne(Integer id);
    /**
     * 获取所有书，降序排列
     * @return
     */
    List<Album> getHotAlbums();
}
