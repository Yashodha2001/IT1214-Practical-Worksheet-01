
public class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        double bonus = salary * 0.1; // 10% bonus
        System.out.println("Bonus: " + bonus);
    }
}
