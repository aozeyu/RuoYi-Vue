package com.ruoyi;

public class AbstractFactoryExample {
  public static void main(String[] args) {
    Factory factory1 = new AppleColaFactory();
    Fruit apple = factory1.createFruit();//获取苹果对象
    Drink cola = factory1.createDrink(); //获取可乐对象
    apple.show(); //输出苹果
    cola.show(); //输出可乐
    Factory factory2 = new BananaOrangeJuiceFactory();
    Fruit banana = factory2.createFruit();//获取香蕉
    Drink orangeJuice = factory2.createDrink();//获取橙汁
    banana.show();
    orangeJuice.show();

  }
}
