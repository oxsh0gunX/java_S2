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

    void display() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of employees: ");
        n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Employee No: ");
            int eNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Employee Salary: ");
            double eSalary = sc.nextDouble();
            employees[i] = new Employee(eNo, eName, eSalary);
        }

        System.out.print("Enter employee number to search: ");
        int searchNo = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchNo) {
                employees[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with number " + searchNo + " not found.");
        }
        sc.close();
    }
}
