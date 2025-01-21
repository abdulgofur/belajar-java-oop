package belajar.java.application;

import belajar.java.dasar.Avanza;
import belajar.java.dasar.Car;

public class CarApp {
  public static void main(String[] args) {
    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();
    System.out.println(car.getBrand());
  }
}
