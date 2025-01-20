public class ManagerApp {
  public static void main(String[] args) {
    var manager = new Manager();

    manager.nama = "Abdul";
    manager.sayHello("Abdul2");

    var vicepresident = new VicePresident();
    vicepresident.nama = "Abdul3";
    vicepresident.sayHello("Abdul4");
  }
}
