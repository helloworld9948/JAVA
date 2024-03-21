public class EncapTest {

    private String name;
    private int age;
    private String idNum;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }
}

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();

        encap.setName("John");
        encap.setAge(30);
        encap.setIdNum("123ABC");

        System.out.println("Name: " + encap.getName());
        System.out.println("Age: " + encap.getAge());
        System.out.println("ID Number: " + encap.getIdNum());
    }
}
