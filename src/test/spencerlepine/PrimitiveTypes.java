package test.spencerlepine;

class PrimitiveTypes {
  public static void main(String[] args) {
    // These are primitives types => storing values
    
    // integer types
    byte aSingleByte = 100; // -128 to 127
    short aSmallNumber = 20000; // -32,768 to 32,767
    int anInteger = 2147483647; // -2147483648 to 2147483647
    // append the L
    long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
    
    // decimal types
    // compiler treats decimal as double by default
    double Double = 1.79769313; // 4.9-324 to 1.7976931348623157308 - 64bit
    // must append the F to end of number for float
    float afloat = 3.4028F; // 1.4E-45 to 3.402823538 - 32bit

    // booleans
    boolean isWeekend = false;
    boolean isWorkday = true;

    // characters
    char copyrightSymbol = '\u00A9';
    // INVALID:
    //  char copyrightSymbol = "\u00A9";
    //  char myString = 'singleQouteWrapped';



    // Implicit conversion
    int number1 = 5;
    double number2 = number1;
    System.out.println(number2);

    // Explicit Conversion
    double num1 = 5.8;
    int num2 = (int)num1; // will throw error otherwise
    System.out.println(num2);
  }
}