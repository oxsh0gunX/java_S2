import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

class Sports {
    double score;

    Sports(double score) {
        this.score = score;
    }
}

class Result extends Student {
    double sportsScore;

    Result(String name, int rollNo, double marks, double sportsScore) {
        super(name, rollNo, marks);
        this.sportsScore = sportsScore;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Academic Marks: " + marks);
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("---------------------------");
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Result[] results = new Result[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            System.out.print("Academic Marks: ");
            double marks = sc.nextDouble();
            System.out.print("Sports Score: ");
            double sportsScore = sc.nextDouble();
            sc.nextLine();

            results[i] = new Result(name, rollNo, marks, sportsScore);
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            results[i].display();
        }

        sc.close();
    }
}
