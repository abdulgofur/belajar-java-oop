package belajar.java.application;

import belajar.java.dasar.Customer;
import belajar.java.dasar.Level;

public class EnumApp {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("Jan");
    customer.setLevel(Level.PREMIUM);

    System.out.println(customer.getName());
    System.out.println(customer.getLevel());
    System.out.println(customer.getLevel().getDescription());
    System.out.println(customer.getLevel().getHero());

    String levelName = Level.PREMIUM.name();
    System.out.println(levelName);

    Level level = Level.valueOf("STANDARD");
    System.out.println(level);

    System.out.println("Print Level");

    for (Level level1 : Level.values()) {
      System.out.println(level1);
    }
  }
}
