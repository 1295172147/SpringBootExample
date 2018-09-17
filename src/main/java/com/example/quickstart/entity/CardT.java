package com.example.quickstart.entity;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author xian
 * @date 2018/9/10
 */
@Data
@Configuration
public class CardT {
    private String picture;
    private String title;
    private String picture2;
    private String title2;
}
