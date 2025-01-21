package belajar.java.dasar;

public class Bus implements Car {
  public void drive() {
    System.out.println("Bus driven");
  }

  public int getTier() {
    return 8;
  }

  public String getBrand() {
    return "Hino";
  }

  public boolean isMaintenance() {
    return false;
  }

  public boolean isFuel() {
    return false;
  }
}
