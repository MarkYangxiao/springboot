package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Yangxiao on 2018/12/20.
 * desc:
 */

@SpringBootApplication //标注在某个类上，说明这个类是SpringBoot的主配置类，
                       //Spring应该运行这个类的main方法来启动SpringBoot应用
public class HelloWorldApplication {

  public static void main(String[] args) {
    //Spring 应用启动, 传入的参数类必须是@SpringBootApplication 注解的类
    SpringApplication.run(HelloWorldApplication.class, args);
  }
}
