package test.spencerlepine;

class Operators {
  public static void main(String[] args) {
    int number = 12;
    number %= 2;
    number -= 2;
    System.out.println(number);

    // Equality Operators
    int numA = 19;
    int numB = 20;
    System.out.println(numA == numB);
    // !=
    // >, <, >=, <=

    // Boolean Conditions
    int age = 20;
    boolean canDrink = age >= 21 && age <= 99;
    boolean isCoolBirthday = age == 16 || age == 21;
    System.out.println(canDrink);
  }
}