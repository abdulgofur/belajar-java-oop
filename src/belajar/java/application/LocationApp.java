package belajar.java.application;

import belajar.java.dasar.City;
import belajar.java.dasar.Location;

public class LocationApp {
  public static void main(String[] args) {
//    var location = new Location();
    var city = new City();
    city.name = "San Francisco";

    System.out.println(city.name);
  }
}
