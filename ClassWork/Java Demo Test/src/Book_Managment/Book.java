package Book_Managment;

public class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private String category;
    private int price;
    private double rating;

    public Book(){
        this.bookId = 0;
        this.bookName = null;
        this.authorName = null;
        this.category = null;
        this.price = 0;
        this.rating = 0;
    }

    public Book(int bookId, String bookName, String authorName, String category, int price, double rating) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }


    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    //setter


    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
