class ParentClass {
    int a;

    void setData(int a) {
        this.a = a;
    }
}

class Child1 extends ParentClass {
    void display() {
        System.out.println("Inside Child1 class");
        System.out.println("Value of a in Child1: " + a);
    }
}

class Child2 extends ParentClass {
    void display() {
        System.out.println("Inside Child2 class");
        System.out.println("Value of a in Child2: " + a);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.setData(10);
        child1.display();

        Child2 child2 = new Child2();
        child2.setData(20);
        child2.display();
    }
}
