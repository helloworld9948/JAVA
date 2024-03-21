class ParentClass {
    int a;

    void setData(int a) {
        this.a = a;
    }
}

class ChildClass extends ParentClass {
    void display() {
        System.out.println("Inside child class");
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
