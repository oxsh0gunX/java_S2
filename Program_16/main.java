interface Bill
{
    void calculate();
}

class Order implements Bill
{
    int orderNo = 101;
    String item = "Pen";
    int quantity = 5;
    double price = 10;
    double total;

    public void calculate()
    {
        total = quantity * price;
    }

    void display()
    {
        System.out.println("----- BILL -----");
        System.out.println("Order No : " + orderNo);
        System.out.println("Item     : " + item);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price    : " + price);
        System.out.println("Total    : " + total);
    }
}

public class Main
{
    public static void main(String args[])
    {
        Order o = new Order();
        o.calculate();
        o.display();
    }
}
