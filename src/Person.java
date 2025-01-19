public class Person {
  String nama;
  String alamat;
  final String country = "Indonesia";

  Person(String paramNama, String paramAlamat) {
    nama = paramNama;
    alamat = paramAlamat;
  }

  Person(String paramNama) {
    this(paramNama, null);
  }

  Person() {
    this(null);
  }

  void sayHello(String paramNama) {
    System.out.println("Hello " + paramNama + " My name is " + nama + "!");
  }
}
