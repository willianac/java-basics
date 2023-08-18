package oop;

public class Drum extends Instrument {
  private String name = "bateria";
  private int numberOfBoxes;
  
  Drum(
    int numberOfBoxes,
    double price,
    int difficultLevel
  ) {
    super(price, difficultLevel);
    this.numberOfBoxes = numberOfBoxes;
  }

  public String getName() {
    return this.name;
  }

  public int getNumOfBoxes() {
    return this.numberOfBoxes;
  }

}
