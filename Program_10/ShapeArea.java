import java.util.Scanner;

class AreaCalculator {
    double area(double radius) {
        return 3.14159 * radius * radius;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + ac.area(r));

        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        System.out.println("Area of Rectangle: " + ac.area(l, w));

        System.out.print("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Triangle: " + ac.area(b, h, true));

        sc.close();
    }
}
