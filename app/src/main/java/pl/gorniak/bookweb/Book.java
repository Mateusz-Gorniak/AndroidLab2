package pl.gorniak.bookweb;
import java.util.Date;

public class Book{

    String book_title;
    String book_author;
    Date date;

    public Book(){};

    public  Book(String book_title, String book_author, Date date){

        this.book_title = book_title;
        this.book_author = book_author;
        this.date = date;
    }
    @Override
    public String toString() {
        return "Book{" +
                "book_title='" + book_title + '\'' +
                ", book_author='" + book_author + '\'' +
                ", date=" + date +
                '}';
    }
    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


}
