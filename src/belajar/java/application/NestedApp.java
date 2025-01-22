package belajar.java.application;

import belajar.java.dasar.Company;

public class NestedApp {
  public static void main(String[] args) {

    Company company = new Company();
    company.setName("Prudent");
    Company.Employee employee =  company.new Employee();
    employee.setName("Jane Doe");

    System.out.println(employee.getName());
    System.out.println(employee.getCompanyName());

    Company company2 = new Company();
    company2.setName("Prudent2");

    Company.Employee employee2 = company2.new Employee();
    employee2.setName("Jane Doe2");

    System.out.println(employee2.getName());
    System.out.println(employee2.getCompanyName());

    Company company3 = new Company();
    company3.setName("GOA");

    Company.Employee employee3 = company3.new  Employee();
    employee3.setName("Jane Doe3");

    System.out.println(employee3.getName());
    System.out.println(employee3.getCompanyName());

  }
}
