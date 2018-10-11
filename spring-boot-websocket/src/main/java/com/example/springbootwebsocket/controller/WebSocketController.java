package com.example.springbootwebsocket.controller;

import com.example.springbootwebsocket.config.WebSocketServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author asus
 */
@RestController
public class WebSocketController {

    @RequestMapping("/socket")
    public String openTencent(){
//        String info = "";
//        try {
//            info = WebSocketServer.getAllInfo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        map.addAttribute("info",info);
        return "tencent";
    }

    /**
     * 推送数据
     * @param say
     * @return
     */
    @RequestMapping("/socket/push")
    public String pushMsg(@RequestParam("say") String say) {
        try {
            WebSocketServer.sendInfo("服务器推送消息"+say);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "tencent";
    }

}