package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yangxiao on 2018/12/20.
 * desc:
 */

//@Controller
@RestController
public class HelloController {

 // @ResponseBody
  @RequestMapping("/hello")
  public String hello() {
    return "Hello World...";
  }
}
