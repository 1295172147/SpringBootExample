package com.example.springbootjpa.servicce;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author asus
 */
@Component
public class QuartzService {

//    上一次 启动时间点之后 X秒执行一次
    @Scheduled(fixedRate = 5000)
    public void timerToZZP(){
        System.out.println("ZZP:" + new Random().nextLong() + new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }
}
