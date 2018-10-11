package com.example.springbootdemo2.entity;

import com.example.springbootdemo2.service.WalksService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SporterJob {

    @Resource
    private WalksService walksService;

    @Scheduled(cron = "0 00 17 * * ? ")
    public void updateTodayWalks() throws Exception {
        walksService.updateWalks();
    }

}