package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yangxiao on 2018/12/24.
 * desc:
 */
@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello world";
  }
}
