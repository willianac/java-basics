package oop;

public class Instrument {
  private double price;
  private int difficultLevel;

  Instrument(double price, int difficultLevel) {
    this.price = price;
    this.difficultLevel = difficultLevel;
  }
  
  public double getPrice() {
    return this.price;
  }
  public int getDifficultLevel() {
    return this.difficultLevel;
  }

}
