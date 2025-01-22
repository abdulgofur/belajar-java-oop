package belajar.java.application;

import belajar.java.dasar.Application;
import belajar.java.dasar.Constant;
import belajar.java.dasar.Country;
import belajar.java.util.MathUtil;

public class staticApp {
  public static void main(String[] args) {
    System.out.println(Constant.APPLICATION);
    System.out.println(Constant.VERSION);

    System.out.println(
        MathUtil.sum(1,1,1,1,1)
    );

    Country.City city = new Country.City();
    city.setName("Kentucky");

    System.out.println(city.getName());

    System.out.println(Application.PROCESSORS);
  }
}
