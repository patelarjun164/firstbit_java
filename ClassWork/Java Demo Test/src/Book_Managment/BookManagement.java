package Book_Managment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BookManagement {
    public static int bookIndex = 6;
    static Scanner sc = new Scanner(System.in);
    Book[] brr = new Book[10];

    public BookManagement() {
        brr[0] = new Book(1000, "C Programming", "arjun", "cs", 750, 4.5);
        brr[1] = new Book(1001, "C Plus Plus", "arjun", "cs", 820, 5);
        brr[2] = new Book(1002, "C Plus Plus", "arjun", "cs", 820, 5);
        brr[3] = new Book(1003, "Java", "mike", "cs", 950, 3.8);
        brr[4] = new Book(1004, "Machine Design", "arjun", "mechanical", 1500, 5.0);
        brr[5] = new Book(1005, "Fluid Mechanics", "mike", "mechanical", 1200, 4.1);
    }

    public void displayAllBooks() {
        for (int i = 0; i < bookIndex; i++) {
            System.out.println("---------------------");
            System.out.println("Book Id --> " + brr[i].getBookId());
            System.out.println("Book Name --> " + brr[i].getBookName());
            System.out.println("Author Name --> " + brr[i].getAuthorName());
            System.out.println("Category --> " + brr[i].getCategory());
            System.out.println("Price --> " + brr[i].getPrice());
            System.out.println("Rating --> " + brr[i].getRating());
            System.out.println("---------------------\n");
        }
    }

    public void displayAllBooks(Book[] tempBrr) {
        for (int i = 0; i < bookIndex; i++) {
            System.out.println("---------------------");
            System.out.println("Book Id --> " + tempBrr[i].getBookId());
            System.out.println("Book Name --> " + tempBrr[i].getBookName());
            System.out.println("Author Name --> " + tempBrr[i].getAuthorName());
            System.out.println("Category --> " + tempBrr[i].getCategory());
            System.out.println("Price --> " + tempBrr[i].getPrice());
            System.out.println("Rating --> " + tempBrr[i].getRating());
            System.out.println("---------------------\n");
        }
    }

    public void displayAllBooks(int i) {
        System.out.println("---------------------");
        System.out.println("Book Id --> " + brr[i].getBookId());
        System.out.println("Book Name --> " + brr[i].getBookName());
        System.out.println("Author Name --> " + brr[i].getAuthorName());
        System.out.println("Category --> " + brr[i].getCategory());
        System.out.println("Price --> " + brr[i].getPrice());
        System.out.println("Rating --> " + brr[i].getRating());
        System.out.println("---------------------\n");
    }

    public void addBook() {
        System.out.println("How many books do you want to add?");
        int nCount = sc.nextInt();
        sc.nextLine();

        while (nCount != 0) {
            if (bookIndex >= brr.length) {
                System.out.println("Book array is full, cannot add more books.");
                break;
            }

            System.out.println("Enter book details");
            System.out.print("Enter book id: ");
            int bookId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter book name: ");
            String bookName = sc.nextLine();

            System.out.print("Enter author name: ");
            String authorName = sc.nextLine();

            System.out.print("Enter category: ");
            String category = sc.nextLine();

            System.out.print("Enter price: ");
            int price = sc.nextInt();
            while (price < 0) {
                System.out.println("Enter valid price greater than zero!");
                price = sc.nextInt();
            }

            System.out.print("Enter rating: ");
            double rating = sc.nextDouble();
            while (rating < 0 || rating > 5) {
                System.out.println("Enter valid rating between 0 and 5!");
                rating = sc.nextDouble();
            }

            brr[bookIndex] = new Book(bookId, bookName, authorName, category, price, rating);
            System.out.println("\n\033[1;32mBook added successfully with id ->\033[0m \033[1;35m" + bookId + "\033[0m");
            bookIndex++;
            nCount--;
        }
    }

    public int searchBookById(int tempId) {
        for (int i = 0; i < bookIndex; i++) {
            if (brr[i].getBookId() == tempId) {
                return i;
            }
        }
        return -1;
    }

    public void searchBookByName() {
        String tempName;
        boolean flag = true;

        // Taking book name to search
        System.out.println("Enter book name to search");
        tempName = sc.nextLine();
        if (tempName.isEmpty()) {
            System.out.println("\t\033[1;31mPlease Enter valid String!\033[0m\n\n");
            return;
        }
        System.out.println("\t\t\033[1;36m-----Search Results-----\033[0m\n");
        for (int i = 0; i < bookIndex; i++) {
            if (brr[i].getBookName().toLowerCase().contains(tempName.toLowerCase())) {
                displayAllBooks(i);
                flag = false;
            }
        }

        if (flag)
            System.out.println("\n\033[1;31mBook Not Found! Try again with available book names!\033[0m\n\n");
    }

    public void fetchBooksByAuthor() {
        String authorName;
        boolean flag = true;

        // Taking authorname name to search
        System.out.println("Enter author name to search books");
        authorName = sc.nextLine();
        if (authorName.isEmpty()) {
            System.out.println("\t\033[1;31mPlease Enter valid Author Name!\033[0m\n\n");
            return;
        }
        System.out.println("\t\t\033[1;36m-----Search Results-----\033[0m\n");
        for (int i = 0; i < bookIndex; i++) {
            if (brr[i].getAuthorName().toLowerCase().contains(authorName.toLowerCase())) {
                displayAllBooks(i);
                flag = false;
            }
        }

        if (flag)
            System.out.println("\n\033[1;31mBook Not Found! Try again with available author names!\033[0m\n\n");
    }

    public void fetchBooksByCategory() {
        String category;
        boolean flag = true;

        // Taking authorname name to search
        System.out.println("Enter book category to search books");
        category = sc.nextLine();
        if (category.isEmpty()) {
            System.out.println("\t\033[1;31mPlease Enter valid Author Name!\033[0m\n\n");
            return;
        }
        System.out.println("\t\t\033[1;36m-----Search Results-----\033[0m\n");
        for (int i = 0; i < bookIndex; i++) {
            if (brr[i].getCategory().toLowerCase().contains(category.toLowerCase())) {
                displayAllBooks(i);
                flag = false;
            }
        }

        if (flag)
            System.out.println("\n\033[1;31mBook Not Found! Try again with available book category!\033[0m\n\n");
    }

    public void sortBookByPrice() {
        int choice, costliestBookId, cheapestBookId;
        Book[] tempBooks = Arrays.copyOf(brr, bookIndex);
        System.out.println("Press 1 for low to high pricing\n");
        System.out.println("Press 2 for High to low pricing\n");
        System.out.println("Press 3 to find costliest book\n");
        System.out.println("Press 4 to find most affordable book\n");
        System.out.println("Press 5 to top 3 highly priced book\n");
        choice = sc.nextInt();


        if (choice == 1) {
            Arrays.sort(tempBooks, Comparator.comparingInt(Book::getPrice));
            costliestBookId = tempBooks[bookIndex - 1].getBookId();
            cheapestBookId = tempBooks[0].getBookId();
        } else {
            Arrays.sort(tempBooks, Comparator.comparingInt(Book::getPrice).reversed());
            costliestBookId = tempBooks[0].getBookId();
            cheapestBookId = tempBooks[bookIndex - 1].getBookId();
        }

        switch (choice) {
            case 1: {
                System.out.println("\t\t\033[1;36m------Books Sorted by Price LOW to HIGH------\033[0m\n");
                displayAllBooks(tempBooks);
                break;
            }
            case 2: {
                System.out.println("\t\t\033[1;36m------Books Sorted by Price LOW to HIGH------\033[0m\n");
                displayAllBooks(tempBooks);
                break;
            }
            case 3: {
                System.out.println("\t\t\033[1;36m------Costliest Book in Library------\033[0m\n");
                displayAllBooks(searchBookById(costliestBookId));
                break;
            }
            case 4: {
                System.out.println("\t\t\033[1;36m------Most Affordable Book in Library------\033[0m\n");
                displayAllBooks(searchBookById(cheapestBookId));
                break;
            }

            case 5: {
                System.out.println("\t\t\033[1;36m-----Top 3 Highly Priced books-----\033[0m\n");
                for (int i = 0; i < 3; i++) {
                    displayAllBooks(searchBookById(tempBooks[i].getBookId()));
                }
                break;
            }

            default:
                System.out.println("\t\033[1;31mInvalid Choice!!!\033[0m\n\n");
                break;
        }
    }
}
