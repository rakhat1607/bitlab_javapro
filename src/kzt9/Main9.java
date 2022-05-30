package kzt9;

public class Main9 {
    public static void main(String[] args) {
        Book book = new Book(1,"NAME","AUTHOR");
        System.out.println(book.getData());
    }
}

class Book {
    private int id;
    private String name;
    private String author;

    public Book() {
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData() {
        return getId() + " " + getName() + " " + getAuthor();
    }
}
class Library{
    private String nameLib;
    private String city;
    Book books[] = new Book[20];
    int index = 0;

    public Library() {
    }

    public Library(String nameLib, String city, Book[] books, int index) {
        this.nameLib = nameLib;
        this.city = city;
        this.books = books;
        this.index = index;
    }

    public String getNameLib() {
        return nameLib;
    }

    public void setNameLib(String nameLib) {
        this.nameLib = nameLib;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addBooks(Book book){
        books[index++] = book;
    }
    public void printBooks(){
        System.out.println();
    }
}
