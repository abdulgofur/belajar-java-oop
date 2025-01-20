public class Manager {
  String nama;
  String company;

  Manager(String nama) {
    this.nama = nama;
  }

  Manager(String nama,String company) {
    this.nama = nama;
    this.company = company;
  }

  void sayHello(String nama) {
    System.out.println("Hello " + nama + " My Name is Manager " + this.nama);
  }


}
