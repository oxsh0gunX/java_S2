import arithmetic.*;

public class TestArithmetic
{
    public static void main(String args[])
    {
        int a = 20;
        int b = 5;

        Add ad = new Add();
        Subtract su = new Subtract();
        Multiply mu = new Multiply();
        Divide di = new Divide();

        System.out.println("Addition = " + ad.calculate(a,b));
        System.out.println("Subtraction = " + su.calculate(a,b));
        System.out.println("Multiplication = " + mu.calculate(a,b));
        System.out.println("Division = " + di.calculate(a,b));
    }
}
