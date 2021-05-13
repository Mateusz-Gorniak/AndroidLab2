package pl.gorniak.bookweb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BooksListActivity extends AppCompatActivity {

    //dodanie listy book
    List<Book> books = new ArrayList<>();

    SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
    Date dt = format.parse("2005/01/10");
    Date dt1 = format.parse("1999/05/12");
    Date dt2 = format.parse("2011/11/05");
    Date dt3 = format.parse("1986/08/14");
    Date dt4 = format.parse("2004/12/16");
    Date dt5 = format.parse("2009/03/12");
    Date dt6 = format.parse("1995/02/23");
    Date dt7 = format.parse("1997/02/26");
    Date dt8 = format.parse("2012/07/09");
    Date dt9 = format.parse("2015/10/06");
    Date dt10 = format.parse("2016/08/05");
    Date dt11 = format.parse("2021/05/20");

    public BooksListActivity() throws ParseException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_list);

        Book ksiazka1 = new Book("Sztuka wojny","Sun Tzu",dt);
        Book ksiazka2 = new Book("Poradnik pozytywnego myślenia","Mark Dwight",dt1);
        Book ksiazka3 = new Book("Potop","Henryk Sienkiewicz",dt2);
        Book ksiazka4 = new Book("Pan Tadeusz","Adam Mickiewicz",dt3);
        Book ksiazka5 = new Book("Myszy i Ludzie","John Steinbeck",dt4);
        Book ksiazka6 = new Book("Cierpienia Młodego Wertera","Goethe",dt5);
        Book ksiazka7 = new Book("Fantastyka i futurologia","Stanisław Lem",dt6);
        Book ksiazka8 = new Book("Dżuma","Albert Camus",dt7);
        Book ksiazka9 = new Book("Fraszki","Jan Kochanowski",dt8);
        Book ksiazka10 = new Book("Odyseja","Homer",dt9);
        Book ksiazka11 = new Book("Wprowadzenie do Algorytmów","Thomas H.Cormen",dt10);
        Book ksiazka12 = new Book("Rok 1984","Gorege Orwell",dt11);
        Book ksiazka13 = new Book("Potęga podświadomości","Jozeph Murphy",dt10);
        Book ksiazka14 = new Book("Ferdydurke","Witold Gomborowicz",dt10);
        Book ksiazka15 = new Book("Makbet","Wiliam Szekspir",dt5);
        Book ksiazka16 = new Book("Tango","Sławomir Mrożek",dt4);


        books.add(ksiazka1);
        books.add(ksiazka2);
        books.add(ksiazka3);
        books.add(ksiazka4);
        books.add(ksiazka5);
        books.add(ksiazka6);
        books.add(ksiazka7);
        books.add(ksiazka8);
        books.add(ksiazka9);
        books.add(ksiazka10);
        books.add(ksiazka11);
        books.add(ksiazka12);
        books.add(ksiazka13);
        books.add(ksiazka14);
        books.add(ksiazka15);
        books.add(ksiazka16);

        for (Book i : books){
            Log.d("Lista zawiera książkę: ",i.toString());
        }

        BookListAdapter bookListAdapter = new BookListAdapter(books);

        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.books_list_recycler_view);

        bookRecyclerView.setAdapter(bookListAdapter);
        bookRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}