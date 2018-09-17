package com.example.quickstart.entity;

import lombok.Data;

/**
 *
 * @author xian
 * @date 2018/9/10
 */
@Data
public class Card {
    private String imgLink;
    private String title;

    public Card(){
    }
    public Card(String imgLink,String title){
        this.imgLink=imgLink;
        this.title=title;
    }
}
