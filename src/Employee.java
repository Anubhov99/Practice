//Super class
public class Employee {
    double salary = 30000.0;
}



// subclass
class Manager extends Employee  {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m.salary);// accessing parent/super class fields.
    }
}
