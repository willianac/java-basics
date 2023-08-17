import java.util.Scanner;

class Inputs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Heey you! What is your name?");
    String name = scanner.nextLine();

    System.out.println("Hii " + name + ". How old are you?");
    int age = Integer.parseInt(scanner.nextLine());
    System.out.println("Wow! " + age + " is a nice age to learn programming! Are you working already or just studying?");

    String response = scanner.nextLine();
    System.out.println(response + ". Ok thats good!");

    scanner.close();
  } 
}