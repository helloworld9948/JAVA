interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Inside method1");
    }

    public void method2() {
        System.out.println("Inside method2");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1(); // Call method1 from Interface1
        obj.method2(); // Call method2 from Interface2
    }
}
