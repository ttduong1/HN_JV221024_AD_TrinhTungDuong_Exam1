package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.Scanner;

public class Author implements IShop {
    private int authorId;
    private String authorName;
    private Boolean sex;
    private int year;

    public Author() {
    }

    public Author(int authorId, String authorName, Boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author Id: ");
        authorId = scanner.nextInt();
        System.out.println("Enter Author Name");
        authorName = scanner.next();
        System.out.println("Enter Sex: ");
        sex = scanner.nextBoolean();
        System.out.println("Enter Year: ");
        year = scanner.nextInt();
    }

    @Override
    public void displayData() {
        System.out.println("Author Id: " + authorId);
        System.out.println("Author Name: " + authorName);
        System.out.println("Sex: " + sex);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Author author = new Author();
        author.inputData();
        author.displayData();
    }
}