package ra.run;

import ra.bussinessImp.Author;
import ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author author = new Author();
        ArrayList<Book> books = new ArrayList<>();
        int sizeBook = 0;
        ArrayList<Author> authors = new ArrayList<>();
        int sizeAuthor = 0;
        System.out.println("Bạn vui lòng nhập số lượng tác giả: ");
        sizeAuthor = scanner.nextInt();
        for (int i = 0; i < sizeAuthor; i++) {
            authors.add(author);
            authors.get(i).inputData();
        }
        System.out.println("Bạn vui lòng nhập số lượng sách: ");
        sizeBook = scanner.nextInt();
        Book book = new Book();
        for (int i = 0; i < sizeBook; i++) {
            book.setAuthors(authors);
            books.add(book);
            book.inputData();
        }
        book.displayData();
    }
}
