class Manager extends Employee {
  String company;

  Manager(String nama) {
    super(nama);
  }

  Manager(String nama, String company) {
    super(nama);
    this.company = company;
  }

  void sayHello(String nama) {
    System.out.println("Hello " + nama + " My Name is Manager " + this.nama);
  }

}
