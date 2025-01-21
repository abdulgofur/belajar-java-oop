package belajar.java.application;

import belajar.java.dasar.Product;

public class Application {
  public static void main(String[] args) {

    Product product = new Product("Mac book", 30000000);
    System.out.println(product.name);
    System.out.println(product.price);
  }
}
