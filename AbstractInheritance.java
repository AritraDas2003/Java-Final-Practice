/*
 * Create an abstract class employee, having its properties and abstract funtion for calculating 
 * net sallary and displaying the information 
 * derive mannager and clark class from this abstract class and implement the abstract method 
 * net sallary and override the display method 
 * 
 * 
 */



import java.util.Scanner;

abstract class Employee {
    String name;
    double base_salary, bonus;

    abstract void netSalary(double base_salary, double bonus);

    abstract void display();
}

class Manager extends Employee {
    double total;

    Manager(String name, double base_salary, double bonus) {
        this.name = name;
        this.base_salary = base_salary;
        this.bonus = bonus;
        netSalary(base_salary, bonus);
    }

    void netSalary(double base_salary, double bonus) {
        total = base_salary + bonus;
    }

    void display() {
        System.out.println("Manager's Name: " + name);
        System.out.println("Base Salary: $" + base_salary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + total);
    }
}

class Clerk extends Employee {
    double total;

    Clerk(String name, double base_salary, double bonus) {
        this.name = name;
        this.base_salary = base_salary;
        this.bonus = bonus;
        netSalary(base_salary, bonus);
    }

    void netSalary(double base_salary, double bonus) {
        total = base_salary + bonus;
    }

    void display() {
        System.out.println("Clerk's Name: " + name);
        System.out.println("Base Salary: $" + base_salary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + total);
    }
}

public class AbstractInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Manager's Name:");
        String managerName = sc.nextLine();
        System.out.println("Enter Manager's Base Salary:");
        double managerBaseSalary = sc.nextDouble();
        System.out.println("Enter Manager's Bonus:");
        double managerBonus = sc.nextDouble();

        Manager manager = new Manager(managerName, managerBaseSalary, managerBonus);
        manager.display();

        System.out.println();

        sc.nextLine(); // Consume newline character left by nextDouble() ai ta korte hbe na hole null debe

        System.out.println("Enter Clerk's Name:");
        String clerkName = sc.nextLine();
        System.out.println("Enter Clerk's Base Salary:");
        double clerkBaseSalary = sc.nextDouble();
        System.out.println("Enter Clerk's Bonus:");
        double clerkBonus = sc.nextDouble();

        Clerk clerk = new Clerk(clerkName, clerkBaseSalary, clerkBonus);
        clerk.display();

        sc.close();
    }
}



