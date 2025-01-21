class Employee {
  String nama;

  Employee(String nama){
    this.nama = nama;
  }

  void sayHello(String nama) {
    System.out.println("Hello " + nama + " My Name is Employee " + this.nama );
  }
}
