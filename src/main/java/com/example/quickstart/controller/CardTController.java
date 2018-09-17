package com.example.quickstart.controller;

import com.example.quickstart.entity.CardT;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xian
 * @date 2018/9/10
 */
@Controller
public class CardTController {
    @Resource
    private List<CardT>cardTList;
    @GetMapping("CardT")
    public String cardTList(ModelMap map){
        cardTList=new ArrayList<>();
       CardT cardT=new CardT();
        cardT.setPicture("https://cdn.sspai.com/2018/07/23/521dfa9b74e80cd38b6b1a6fbb1f2467.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220");
        cardT.setTitle("简单三步");
        cardT.setTitle2("玩转workflow");
        cardT.setPicture2("https://cdn.sspai.com/other/136_1490237571570.jpg?imageMogr2/quality/95/thumbnail/!828x442r/gravity/Center/crop/828x442");

       CardT cardT1=new CardT();
        cardT1.setPicture("https://cdn.sspai.com/2018/07/27/14f6df1cca005e5ecabddd3e47f9aaa2.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220");
        cardT1.setTitle("福利派丨夹在显示器上的台灯，美观实用的完美照明解决方案：明基 ScreenBar Plus 屏幕挂灯");
        cardT1.setPicture2("https://cdn.sspai.com/other/705956_1490770613690.jpg?imageMogr2/quality/95/thumbnail/!828x442r/gravity/Center/crop/828x442");
        cardT1.setTitle2("提升效率之路");

       CardT cardT2=new CardT();
        cardT2.setPicture("https://cdn.sspai.com/2018/07/15/17ef4fe0943f250dde344880ccdb5717.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220");
        cardT2.setTitle("智能家居初体验 | 带你认识我家的赵狗剩、赵铁柱和赵小爱");
        cardT2.setPicture2("https://cdn.sspai.com/other/718855_1493173455255.png?imageMogr2/quality/95/thumbnail/!828x442r/gravity/Center/crop/828x442");
        cardT2.setTitle2("装了啥？");

        cardTList.add(cardT);
        cardTList.add(cardT1);
        cardTList.add(cardT2);
        map.addAttribute("cardTList",cardTList);
       return "cardT";
    }
}
