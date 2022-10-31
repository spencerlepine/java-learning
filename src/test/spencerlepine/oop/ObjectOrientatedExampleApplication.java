package test.spencerlepine.oop;

import java.time.LocalDate;

class ObjectOrientatedExampleApplication {  
  public static void main(String[] arguments) {
    User youngUser = new User("Hugh Mungus", "1995-01-31");
    System.out.println(youngUser.name + " - " + youngUser.dateOfBirth);
  }
}