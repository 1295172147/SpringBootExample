package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author xian
 * @date 2018/9/10
 */
@Configuration
@Data
public class CardDAO {
    public List<Card> getCard(){
        Card[] cards={
                new Card("1.jpg","FD"),
                new Card("1.jpg","FD"),
                new Card("1.jpg","F"),
                new Card("1.jpg","F"),
                new Card("1.jpg","F"),
                new Card("1.jpg","F"),
                new Card("1.jpg","F"),
                new Card("1.jpg","F"),
        };
        List<Card> cardList= Arrays.asList(cards);
        return cardList;
    }
    public User getUser(){
        User user=new User();
        user.setName("123");
        user.setAvatar("1.jpg");
        return user;
    }
}
