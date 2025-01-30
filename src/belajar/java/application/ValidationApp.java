package belajar.java.application;

import belajar.java.dasar.LoginRequest;
import belajar.java.error.ValidationException;
import belajar.java.util.ValidationUtil;

public class ValidationApp {
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest(null, "1");

    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data valid");
    }  catch (ValidationException | NullPointerException e) {
      if (e instanceof NullPointerException) {
        System.out.println("Data tidak invalid null : " + e.getMessage());
      } else {
        System.out.println("Data Tidak invalid : " + e.getMessage());
      }
    } finally {
      System.out.println("selalu di eksekusi");
    }

    LoginRequest loginRequest2 = new LoginRequest(null, "2");

    ValidationUtil.validateRuntime(loginRequest2);
    System.out.println("Data valid");
  }
}
