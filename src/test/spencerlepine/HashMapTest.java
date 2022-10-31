package test.spencerlepine;

import java.util.HashMap;

public class HashMapTest {
  public static void main(String[] args) {
    // Create a HashMap
    HashMap<String, Integer> examScores = new HashMap<String, Integer>();

    examScores.put("Math", 75);
    examScores.put("Ligma", 99);
    examScores.put("Scientology", 99);
    examScores.putIfAbsent("Math", 99);

    System.out.print(examScores.toString());

    // Getting Values
    int scoreValue = examScores.get("Math");
    examScores.getOrDefault("Math", -1);
    
    // Replace Values
    examScores.replace("Math", 10);

    // Remove Values
    examScores.remove("Math");

    // Entire Hashmap Methods
    examScores.size();
    examScores.clear();
    examScores.isEmpty();
    examScores.containsKey("Math"); // boolean
    examScores.containsValue(Integer.valueOf(100));
  }
}
