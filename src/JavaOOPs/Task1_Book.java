package JavaOOPs;

public class Task1_Book {

	String title;
    String author;
    double price;

    public Task1_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
    	Task1_Book book1 = new Task1_Book("The Alchemist", "Paulo Coelho", 399.00);
    	Task1_Book book2 = new Task1_Book("Clean Code", "Robert C. Martin", 599.00);

        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }

}
