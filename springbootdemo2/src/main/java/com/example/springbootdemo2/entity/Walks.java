package com.example.springbootdemo2.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Walks {
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 行走的步数
     */
    private Integer walkCount;

    /**
     * 创建的时间
     */
    private Date createTime;

    public Walks() {

    }

    public Walks(Integer walkCount, Date createTime) {
        this.walkCount = walkCount;
        this.createTime = createTime;
    }
}