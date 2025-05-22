
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.print("Enter name: ");
        p.setName(sc.nextLine());
        System.out.print("Enter age: ");
        p.setAge(sc.nextInt());
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        sc.close();
    }
}

