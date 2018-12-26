package com.atguigu.springboot.bean;

/**
 * Created by Yangxiao on 2018/12/24.
 * desc:
 */
public class Dog {

  private String name;
  private String owner;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dog{" +
            "name='" + name + '\'' +
            ", owner='" + owner + '\'' +
            '}';
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
}
