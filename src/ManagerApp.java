public class ManagerApp {
  public static void main(String[] args) {
    var manager = new Manager("Abdul");
    manager.sayHello("Abdul2");

    var vicepresident = new VicePresident("Abdul3", "Prudential");
    vicepresident.sayHello("Abdul4");
  }
}
