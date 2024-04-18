abstract class Sunstar{
    abstract void printInfo();
    }
    class Employee extends Sunstar{
    void printInfo(){
    String name = "Harjeeth";
    int age = 6;
    float salary = 000.00F;
    System.out.println(name);
    System.out.println(age);
    System.out.println(salary);
    }
    }
    public class Base {
    public static void main(String args[]){
    Sunstar s = new Employee();
    s.printInfo();
    }
    }