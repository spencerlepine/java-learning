package test.spencerlepine.oop;

public class Truck extends Car {
  private int bedLength;

  public Truck(int year, String make, String model, int bedLength) {
    super(year, make, model);
    
    this.bedLength = bedLength;
  }

  public static void main(String[] args) {
    Truck truck = new Truck(2022, "Tesla", "CyberTruck", 9999);
    System.out.println(truck.getYear());
  }
}