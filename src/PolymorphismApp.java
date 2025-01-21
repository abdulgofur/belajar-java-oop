public class PolymorphismApp {
  public static void main(String[] args) {
    Employee employee = new Employee("Abdul");
    employee.sayHello("Budi");

    employee = new Manager("joko");
    employee.sayHello("Budi");

    employee = new VicePresident("JAMAL", "PRUDENTIAL");
    employee.sayHello("Budi");

    sayHello(new Employee("Abdul"));
    sayHello(new Manager("joko"));
    sayHello(new VicePresident("JAMAL", "PRUDENTIAL"));
  }
  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident v = (VicePresident) employee;
      System.out.println("Hai VicePresident " + v.nama);
    } else if (employee instanceof Manager) {
      Manager m = (Manager) employee;
      System.out.println("Hai Manager " + m.nama);
    } else if (employee instanceof Employee) {
      Employee e = (Employee) employee;
      System.out.println("Hai Employee " + e.nama);
    }

  }
}
