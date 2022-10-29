package test.spencerlepine;

public class StringsPractice {
  public static void main(String[] args) {
    char percentSign = '%';
    System.out.println(percentSign);

    // If string exists in JVM, it will re-use it in memory
    // JVM will always create new object
    String name = "Spencer Lepine";
    System.out.println(name);
    String food = new String("Pizza");

    // String interopolation
    String country = "United States"; // %s
    int age = 27; // %d
    double gpa = 9.999; // %d
    char myChar = '_'; // %c
    boolean myBool = true; // %b
    String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I have a gpa of %f", name, country, age, gpa);
    System.out.println(formattedString);
    System.out.println(
      String.format("My name is %s. I am from %s. I am %d years old. I have a gpa of %f", name, country, age, gpa)
    );
    

    // Memory References can be different
    String literalString1 = "abc";
    String literalString2 = "abc";

    String objectString1 = new String("xyz");
    String objectString2 = new String("xyz");

    System.out.println(literalString1 == literalString2);
    System.out.println(objectString1 == objectString2);
  }
}