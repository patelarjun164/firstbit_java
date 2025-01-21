package Book_Managment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        BookManagement bm = new BookManagement();
        do {
            System.out.println("1. Add book");
            System.out.println("2. Display All books");
            System.out.println("3. Search Book by Id");
            System.out.println("4. Search Book by Book Name");
            System.out.println("5. Find books by author name");
            System.out.println("6. Find books by category");
            System.out.println("7. Sort book by Price");
            System.out.println("8. Sort book by rating");
            System.out.println("9. To update book details");
            System.out.println("10. Remove book by id");
            System.out.println("11. Send message to Students for book submission");
            System.out.println("\033[0;31m0. Exit\033[0m");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            switch (n) {
                case 0: {
                    System.out.println("\n\t\033[1;35m_/\\_ Thanks for using our services _/\\_\033[0m\n\n");
                    n=0;
                    break;
                }
                case 1:{
                    bm.addBook();
                    break;
                }
                case 2: {
                    bm.displayAllBooks();
                    break;
                }
                case 3:
                {
                    int tempId;
                    System.out.println("Enter book id to search");
                    tempId = sc.nextInt();
                    int res = bm.searchBookById(tempId);
                    if (res == -1)
                        System.out.println("\033[1;31mBook not Found! Try again with available id!!!\033[0m\n");
                    else
                        bm.displayAllBooks(res);
                    break;
                }
                case 4: {
                    bm.searchBookByName();
                    break;
                }
                case 5:
                {
                    bm.fetchBooksByAuthor();
                    break;
                }
                case 6:
                {
                    bm.fetchBooksByCategory();
                    break;
                }
                case 7:
                {
                    bm.sortBookByPrice();
                    break;
                }

                default: {
                    System.out.println("Enter Valid Choice");
                }
            }
        } while (n != 0);
    }


}
