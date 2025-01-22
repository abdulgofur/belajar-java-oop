package belajar.java.application;

import belajar.java.dasar.HelloWorld;

import java.sql.SQLOutput;

public class HelloWorldApp {
  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld() {

      public void sayHello() {
        System.out.println("Hello World");
      }

      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    HelloWorld Indonesia = new HelloWorld() {
      @Override
      public void sayHello() {
        System.out.println("Hello Indonesia");
      }

      @Override
      public void sayHello(String name) {
        System.out.println("Hello IND " + name);
      }
    };

    helloWorld.sayHello();
    helloWorld.sayHello("Indonesia");

    Indonesia.sayHello();
    Indonesia.sayHello("Indonesia2");
  }
}
