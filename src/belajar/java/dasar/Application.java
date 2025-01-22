package belajar.java.dasar;

public class Application {

  public static final int PROCESSORS;
  static {
    System.out.println("Inside static block");
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }
}
