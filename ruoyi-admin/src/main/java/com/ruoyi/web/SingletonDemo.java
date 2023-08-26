package com.ruoyi.web;


public class SingletonDemo {
  private static SingletonDemo instance;
  private SingletonDemo() {

  }
  public static SingletonDemo getInstance() {
    if (instance == null) {
      instance = new SingletonDemo();
    }
    return instance;
  }
}
