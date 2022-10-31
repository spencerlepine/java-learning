package test.spencerlepine.oop;

import java.time.LocalDate;

public class User {
  public String name;
  public LocalDate dateOfBirth;

  User(String name, String dateOfBirth) {
    this.name = name;
    this.dateOfBirth = LocalDate.parse(dateOfBirth);
  }
}
