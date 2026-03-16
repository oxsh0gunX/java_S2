package graphics;

public class Circle implements Figure
{
    double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public double area()
    {
        return 3.14 * radius * radius;
    }
}
