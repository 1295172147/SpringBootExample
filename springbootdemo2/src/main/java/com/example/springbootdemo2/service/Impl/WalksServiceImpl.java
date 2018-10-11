package com.example.springbootdemo2.service.Impl;

import com.example.springbootdemo2.dao.WalksRepository;
import com.example.springbootdemo2.entity.Walks;
import com.example.springbootdemo2.service.WalksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by lq on 2018/10/10.
 * 步数的service接口的实现类
 */

@Service
public class WalksServiceImpl implements WalksService {

    @Resource
    private WalksRepository walksRepository;

    /**
     * 更新数据
     */
    @Override
    public void updateWalks() {
        List<Walks> list = walksRepository.findAll();
        Random random = new Random();
        for (int i=0;i<list.size();i++){
            Walks walks = list.get(i);
            walks.setWalkCount(random.nextInt(20000)+20000);
            walks.setCreateTime(new Date());
            walksRepository.saveAndFlush(walks);
        }
    }
}

