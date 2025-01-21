package belajar.java.application;

public class EqualsApp {
  public static void main(String[] args) {
    String first = "Abdul";
    first = first + " " + "Gofur";

    System.out.println(first);

    String second = "Abdul Gofur";
    System.out.println(second);

    System.out.println(first == second);
    System.out.println(first.equals(second));

  }
}
