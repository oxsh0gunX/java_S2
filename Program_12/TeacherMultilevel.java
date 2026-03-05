import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int eNo;
    double eSalary;

    Employee(String name, int age, int eNo, double eSalary) {
        super(name, age);
        this.eNo = eNo;
        this.eSalary = eSalary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;

    Teacher(String name, int age, int eNo, double eSalary, String subject, String department) {
        super(name, age, eNo, eSalary);
        this.subject = subject;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee No: " + eNo);
        System.out.println("Salary: " + eSalary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("----------------------------");
    }
}

public class TeacherMultilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Employee No: ");
            int eNo = sc.nextInt();
            System.out.print("Salary: ");
            double eSalary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();

            teachers[i] = new Teacher(name, age, eNo, eSalary, subject, department);
        }

        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}
