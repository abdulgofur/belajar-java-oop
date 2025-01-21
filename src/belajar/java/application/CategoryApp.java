package belajar.java.application;

import belajar.java.dasar.Category;

public class CategoryApp {
  public static void main(String[] args) {

    Category category = new Category();
    category.setId("ID");  
    category.setId("123");

    System.out.println(category.getId());
//    System.out.println(category.isExpensive());
  }
}
