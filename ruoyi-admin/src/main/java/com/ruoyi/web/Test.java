package com.ruoyi.web;

public class Test {
  public static void main(String[] args) {
    int persent = 10;
    //tripleValue函数只是改变了x的值没有改变persent的值
    tripleValue(10);
    System.out.println(persent);
  }
  public static void tripleValue(int x) {
    x = 3 * x;
  }
}
