public class Person {

    private final String name;
    private final int age;
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name is " + name + " Age is " + age);
    }
}
