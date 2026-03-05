import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;

    Teacher(int eNo, String eName, double eSalary, String subject, String department) {
        super(eNo, eName, eSalary);
        this.subject = subject;
        this.department = department;
    }

    void display() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("------------------------");
    }
}

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1));
            System.out.print("Employee No: ");
            int eNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Employee Salary: ");
            double eSalary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();

            teachers[i] = new Teacher(eNo, eName, eSalary, subject, department);
        }

        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}
