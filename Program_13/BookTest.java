import java.util.Scanner;

class Publisher {
    String name;

    Publisher(String name) {
        this.name = name;
    }
}

class Book extends Publisher {
    String title;
    double price;

    Book(String publisherName, String title, double price) {
        super(publisherName);
        this.title = title;
        this.price = price;
    }
}

class Literature extends Book {
    Literature(String publisherName, String title, double price) {
        super(publisherName, title, price);
    }

    void display() {
        System.out.println("Category: Literature");
        System.out.println("Publisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("--------------------------");
    }
}

class Fiction extends Book {
    Fiction(String publisherName, String title, double price) {
        super(publisherName, title, price);
    }

    void display() {
        System.out.println("Category: Fiction");
        System.out.println("Publisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("--------------------------");
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Publisher Name: ");
            String pub = sc.nextLine();
            System.out.print("Book Title: ");
            String title = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Category (L for Literature, F for Fiction): ");
            char cat = sc.nextLine().toUpperCase().charAt(0);

            if (cat == 'L') {
                books[i] = new Literature(pub, title, price);
            } else {
                books[i] = new Fiction(pub, title, price);
            }
        }

        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++) {
            if (books[i] instanceof Literature) {
                ((Literature) books[i]).display();
            } else if (books[i] instanceof Fiction) {
                ((Fiction) books[i]).display();
            }
        }

        sc.close();
    }
}
