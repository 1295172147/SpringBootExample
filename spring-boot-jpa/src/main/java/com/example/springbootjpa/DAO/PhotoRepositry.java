package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepositry extends JpaRepository<Photo,Integer> {
}
