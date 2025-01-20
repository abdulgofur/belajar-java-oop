public class Person {
  String nama;
  String alamat;
  final String country = "Indonesia";

  Person(String nama, String alamat) {
    this.nama = nama;
    this.alamat = alamat;
  }

  Person(String nama) {
    this(nama, null);
  }

  Person() {
    this(null);
  }

  void sayHello(String nama) {
    System.out.println("Hello " + nama + " My name is " + this.nama + "!");
  }

}
