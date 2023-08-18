package oop;

public class Guitar extends Instrument {
  private String name = "guitarra";
  private int numberOfStrings;
  private String model;
  
  Guitar(
    double price, 
    int difficultLevel,
    int numberOfStrings,
    String model
  ) {
    super(price, difficultLevel);;
    this.model = model;
    this.numberOfStrings = numberOfStrings;
  }

  public String getName() {
    return this.name;
  }

  public int getNumOfStrings() {
    return this.numberOfStrings;
  }

  public String getMOdel() {
    return this.model;
  }
}
