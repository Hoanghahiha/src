package library;

public class Book {
    public Integer id;
    public String bookName;
    public String publishDate;
    public String author;
    public String publisher;
    public int price;

    public Book(Integer id, String bookName, String publishDate, String author, String publisher, int price) {
        this.id = id;
        this.bookName = bookName;
        this.publishDate = publishDate;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
