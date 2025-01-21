class Parent {
  String name;
  void doIt () {
    System.out.println("Do it from Parent ");
  }
}

class Child extends Parent {
  String name;
  void doIt () {
    System.out.println("Do it from Child " + name);
    System.out.println("Do it from Parent " + super.name);
  }
}
