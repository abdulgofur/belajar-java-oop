package belajar.java.application;

public class StackTraceApp {
  public static void main(String[] args) {
    try {
      sampleError();
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }

  public static void sampleError() {
    try {
      String[] names = {
          "Eko","Abdul","Eki"
      };
      System.out.println(names[100]);
    } catch (Throwable e) {
      throw  new RuntimeException(e);
    }
  }
}
