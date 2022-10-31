package test.spencerlepine;

import java.util.Scanner;

public class ConditionalSatements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    

    String myName = scanner.nextLine();
    if (myName.equals("pepe")) {
      System.out.println("YEet");
    }

    double number1 = scanner.nextDouble();
    if (number1 == 0) {
      System.out.println("令です!");
    }
  }
}
