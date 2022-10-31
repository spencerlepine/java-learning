package test.spencerlepine;

public class Loops {
  public static void main(String[] args) {
    // For Loop
    for(int i = 0; i < 10; i++) {
      System.out.println("YEET-" + i);
    }

    // While Loop
    int number = 5;
    while (number < 10) {
      System.out.println("YEET2-" + number);
      number++;
    }

    // Do-While Loop
    int num = 5;
    do {
      System.out.println("YEET3-" + num);
      num++;
    } while (num < 10);
  }
}
