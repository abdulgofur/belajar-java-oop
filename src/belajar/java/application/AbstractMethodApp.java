package belajar.java.application;

import belajar.java.dasar.Animal;
import belajar.java.dasar.Cat;

public class AbstractMethodApp {
  public static void main(String[] args) {
    Animal animal = new Cat();
    animal.name = "Kucluk";
    animal.run();
  }
}
