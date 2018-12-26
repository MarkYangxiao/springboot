package com.atguigu.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Yangxiao on 2018/12/24.
 * desc: @ConfigurationProperties 告诉SpringBoot将本类中所有属性与配置文件中的属性绑定
 * prefix = "person"  匹配前缀为person的配置文件
 *
 * 只有这个组件是容器中的组件，才能有容器提供的ConfigurationProperties功能
 */
@Component
//@ConfigurationProperties(prefix = "person")
public class Person {

  @Value("${person.last-name}")
  private String lastName;

  @Value("#{11 * 2}")
  private Integer age;

  @Value("false")
  private boolean boss;
  private Date date;

  private Map<Object, Object> maps;
  private List<Integer> list;

  private Dog dog;

  @Override
  public String toString() {
    return "Person{" +
            "lastName='" + lastName + '\'' +
            ", age=" + age +
            ", boss=" + boss +
            ", date=" + date +
            ", maps=" + maps +
            ", list=" + list +
            ", dog=" + dog +
            '}';
  }

  public Dog getDog() {
    return dog;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public boolean isBoss() {
    return boss;
  }

  public void setBoss(boolean boss) {
    this.boss = boss;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Map<Object, Object> getMaps() {
    return maps;
  }

  public void setMaps(Map<Object, Object> maps) {
    this.maps = maps;
  }

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }
}
