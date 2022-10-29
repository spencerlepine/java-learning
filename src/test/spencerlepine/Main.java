package test.spencerlepine;

class Main {
  static int age; // default value is 0
  
  public static void main(String[] arguments) {
    int age = 10; // "let", can redeclare variable in new code block
    /* INVALID VARIABLE NAMES:
      int 0age;
      int my age;
    */

    System.out.println("Hello world! You are " + age + " years old.");
    
    UserInputs.main(arguments);
  }
}