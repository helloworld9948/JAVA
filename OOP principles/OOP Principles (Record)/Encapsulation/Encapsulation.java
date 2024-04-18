class Person{
    private String name;
    private int age;
    public String getName(){
    return name;
    }
    public void setName(String name)
    {
    this.name = name;
    }
    public int getAge()
    {
    return age;
    }
    public void setAge(int age)
    {
    this.age = age;
    }
    }
    public class Encapsulation {
    public static void main(String args[])
    {
    Person person = new Person();
    person.setName("Sai");
    person.setAge(30);
    System.out.println("Name:" +person.getName() +"\n" +"Age:" + person.getAge());
    }
    }