package com.ruoyi;

public class AppleColaFactory implements Factory{
  @Override
  public Fruit createFruit() {
    return new Apple();
  }

  @Override
  public Drink createDrink() {
    return new Cola();
  }
}
