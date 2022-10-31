package test.spencerlepine;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListTest {
  public static void main(String[] args) {
    // ArrayList cannot use "int", must use Wrapper class 
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.remove(2);
    System.out.println(numbers.get(0));
    System.out.println(numbers.toString());


    numbers.set(2, 9); // new value at index 2


    numbers.sort(Comparator.naturalOrder());

    // length
    numbers.size();

    numbers.forEach(number -> {
      System.out.println(number);
    });

    // LIKE MAP
    numbers.forEach(number -> {
      numbers.set(numbers.indexOf(number), number * 2);
    });

    // Will find literal value of 4
    numbers.remove(Integer.valueOf(4));

    // int double float boolean => PRIMITIVE types
    // Integer => WRAPPER class for "int"

    numbers.clear(); // empty the list
  }
}
