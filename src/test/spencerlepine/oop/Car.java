package test.spencerlepine.oop;

// import java.utils.Objects;

public class Car {
  // Properties of the object
  private final int year;
  private final String make;
  private final String model;

  // Contructor method
  public Car(int year, String make, String model) {
    this.year = year;
    this.make = make;
    this.model = model;
  }

  // Getter methods
  public int getYear() { return this.year; }
  public String getModel() { return this.model; }
  public String getMake() { return this.make; }
}