package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author asus
 */
public interface AlbumRepositry extends JpaRepository<Album,Integer>{
//    自定义查询，得到按照相册喜欢数降序排列
    @Query("FROM  Album a ORDER BY a.likes DESC ")
    List<Album>findHotAlbums();
}
