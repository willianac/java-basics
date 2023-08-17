import java.util.Scanner;

public class Conditionals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Which operation do you want to perform?");
    String operation = scanner.nextLine();
    
    System.out.println("Right. Insert first number");
    int number1 = Integer.parseInt(scanner.nextLine());

    System.out.println("Insert second number");
    int number2 = Integer.parseInt(scanner.nextLine());

    if(operation.equals("sum")) {
      System.out.printf("%d + %d is %d", number1, number2, number1 + number2);
    } else if(operation.equals("sub")) {
      System.out.printf("%d - %d is %d", number1, number2, number1 - number2);
    } else if(operation.equals("mul")) {
      System.out.printf("%d x %d is %d", number1, number2, number1 * number2);
    } else if(operation.equals("div")) {
      System.out.printf("%d / %d is %d", number1, number2, number1 / number2);
    } else {
      System.out.println("This operation is invalid.");
    }
    scanner.close();
  }
}
