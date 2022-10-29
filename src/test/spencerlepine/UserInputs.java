package test.spencerlepine;

import java.util.Scanner;

public class UserInputs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Single line print
    System.out.print("What is your name? ");
    String name = scanner.nextLine();
    System.out.println(name);
    System.out.printf("Hello %s. How are you?\n", name);

    System.out.print("What is your age? ");
    int age = scanner.nextInt();
    System.out.printf("You are %d year old.\n", age);
    // OR
    int ageInt = Integer.parseInt(scanner.nextInt());
    int ageDouble = Double.parseDouble(scanner.nextInt());
    
    // Close out the Scanner from memory
    scanner.close();
  }
}
