package test.spencerlepine;


public class SwitchStatement {
  public static void main(String[] args) {
    String myChoice = "pizza";

    switch(myChoice) {
      case "pizza":
        System.out.println("Good choice!");
        break;
      case "sushi":
        System.out.println("Good choice!");
        break;
      case "brocolli":
        System.out.println("BAD choice! >:(");
        break;
      default:
        System.out.println("Not sure..");
    }
  }
}
