package oop;

public class Main {
  public static void main(String[] args) {
    User user1 = new User("Wallace", "1994-10-21");
    User user2 = new User("Willian", "2001-07-03");
    Guitar guitar = new Guitar(700, 8, 12, "Flying V");
    Drum drum = new Drum(6, 1250, 6);

    System.out.printf("%s está aprendendo a tocar %s, modelo %s de %d cordas. O nivel de dificuldade é de %d \n",
    user1.getName(), guitar.getName(), guitar.getMOdel(), guitar.getNumOfStrings(), guitar.getDifficultLevel());
    
    System.out.printf("Já %s prefere %s, já até aprendeu a tocar esse modelo de %d caixas. Ele pagou %f e tem um nivel de dificuldade de %d. \n",
    user2.getName(), drum.getName(), drum.getNumOfBoxes(), drum.getPrice(), drum.getDifficultLevel());
  }
}