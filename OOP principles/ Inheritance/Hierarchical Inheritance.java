class ParentClass {
    int a;
    
    void setData(int a) {
        this.a = a;
    }
}

class ChildClass extends ParentClass {
    void showData() {
        System.out.println("Value of a is " + a);
    }
}

class Childclassone extends ParentClass {
    void showData() {
        System.out.println("Hai");
    }
}

class ChildThree extends ChildClass { 
    void display() {
        System.out.println("Hello");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.setData(100);
        obj.showData();
    }
}
