package com.ruoyi;

public class BananaOrangeJuiceFactory implements Factory{
  @Override
  public Fruit createFruit() {
    return new Banana();
  }

  @Override
  public Drink createDrink() {
    return new OrangeJuice();
  }
}
