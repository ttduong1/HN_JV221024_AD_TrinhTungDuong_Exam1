package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Book implements IShop {
    private ArrayList<Author> authors;

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private String author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private Boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, Author author, float importPrice, float exportPrice, int quantity, Boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = String.valueOf(author);
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = String.valueOf(author);
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }
    public float exportPrice(){
        return exportPrice = importPrice * RATE;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book Id: ");
        bookId = scanner.nextInt();
        System.out.println("Enter book Name: ");
        bookName = scanner.next();
        System.out.println("Enter Title: ");
        title = scanner.next();
        System.out.println("Enter number OfPages: ");
        numberOfPages = scanner.nextInt();
        System.out.println("Enter import Price: ");
        importPrice = scanner.nextFloat();
        System.out.println("Enter quantity: ");
        quantity = scanner.nextInt();
        System.out.println("Book Status: ");
        bookStatus = scanner.nextBoolean();
        System.out.println("Chọn tác giả: ");
        for (int i = 0; i < getAuthors().size(); i++) {
            getAuthors().get(i).displayData();
        }
        int num = scanner.nextInt();
        for (int i = 0; i < getAuthors().size(); i++) {
            if (num == i+1){
                setAuthor(getAuthors().get(i));
            }
        }
    }

    @Override
    public void displayData() {
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + author);
        System.out.println("Export Price: " + exportPrice());
        System.out.println("Book quantity: " + quantity);
        System.out.println("Book Status: " + bookStatus);
    }
}
