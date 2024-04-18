class Animal{
    void place(){
    System.out.println("Animalslive on earth");
    }
    }
    class Dog extends Animal{
    void place(){
    System.out.println("Dog lives in Kennel");
    }
    }
    class Horse extends Animal{
    void place(){
    System.out.println(" Horse lives in stable");
    }
    }
    class Rabbit extends Animal{
    void place(){
    System.out.println(" Rabbit lives in burrow");
    }
    }
    public class Polymorphism {
    public static void main( String args[]){
    Animal A = new Animal();
    A.place();
    A = new Dog();A.place();
    A = new Horse();
    A.place();
    A = new Rabbit();
    A.place();
    }
    }