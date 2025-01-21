class VicePresident extends Manager{
  VicePresident(String name, String company){
    super(name,company);
  }

  void sayHello(String nama) {
    System.out.println("Hello " + nama + " My Name is VP " + this.nama + " My Company is " + this.company);
  }

}
