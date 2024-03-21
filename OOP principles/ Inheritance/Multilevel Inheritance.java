class GrandParentClass {
    int a;

    void setData(int a) {
        this.a = a;
    }
}

class ParentClass extends GrandParentClass {
    void display() {
        System.out.println("Inside Parent class");
        System.out.println("Value of a in ParentClass: " + a);
    }
}

class ChildClass extends ParentClass {
    void display() {
        System.out.println("Inside Child class");
        System.out.println("Value of a in ChildClass: " + a);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.setData(10);
        child.display();
    }
}
