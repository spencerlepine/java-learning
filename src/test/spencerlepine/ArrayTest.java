package test.spencerlepine;

import java.util.Arrays;

class ArrayTest {
  public static void main(String[] args) {
    // typeOfArray nameOfArray[] = new typeOfArray[lengthOfArray]
    char vowels[] = new char[5];

    vowels[0] = 'c';
    System.out.println(Arrays.toString(vowels));

    char myArray[] = { 'a', 'e', 'i', 'o', 'u'}; // will infer length
    // myArray[2] => 'i'

    Arrays.sort(myArray);

    int startingIndex = 1;
    int endingindex = 4;
    Arrays.sort(myArray, startingIndex, endingindex);

    char key = 'o';
    int indexFound = Arrays.binarySearch(myArray, key);
    System.out.println(myArray[indexFound]);

    // Fill an array with zeros MUTABLE
    int numbers[] = new int[5];
    Arrays.fill(numbers, 0);
    
    // Create copy of
    int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
  }
}