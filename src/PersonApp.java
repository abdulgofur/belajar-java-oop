public class PersonApp {
  public static void main(String[] args) {
    var nama = "Raj";
    var alamat = "Masukkan";
    Person person = new Person(nama, alamat);

    System.out.println("Name : " + person.nama);
    System.out.println("Alamat : " + person.alamat);
    System.out.println("Country : " + person.country);

    Person person2 = new Person("Raj2");

    System.out.println("Name : " + person2.nama);
    System.out.println("Country : " + person2.country);
    System.out.println("================================");

    person2.sayHello("Abdul");

    var person3 = new Person();
  }
}
