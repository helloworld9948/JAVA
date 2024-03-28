class ParentClass {
    int a;

    void setData(int a) {
        this.a = a;
    }
}

class ChildClass extends ParentClass {
    void showData() {
        System.out.println("Inside ChildClass!");
        System.out.println("Value of a is " + a);
    }
}

class ChildClassToo extends ParentClass {
    void display() {
        System.out.println("Inside ChildClassToo!");
        System.out.println("Value of a is " + a);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating an object of ChildClass
        ChildClass child_obj = new ChildClass();
        child_obj.setData(100);
        child_obj.showData();
        
        // Creating an object of ChildClassToo
        ChildClassToo childToo_obj = new ChildClassToo();
        childToo_obj.setData(200);
        childToo_obj.display();
    }
}
