package belajar.java.application;

import belajar.java.error.DatabaseError;

public class DatabaseApp {
  public static void main(String[] args) {

    try{
      ConnectDatabase("abdul", null);
      System.out.println("Berhasil Connect");
    } catch (DatabaseError e){
      System.out.println("Error : " + e.getMessage());
    }

  }

  public static void ConnectDatabase(String user, String pass) {
    if ( user == null || pass == null ) {
      throw new DatabaseError("Tidak bisa connect database");
    }
  }
}
