package pl.gorniak.bookweb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.ViewHolder> {

    private List<Book> books;

    //konstruktor

    public BookListAdapter(List<Book> books){
        this.books= books;
    }


    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.books_list_element, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        Book book = books.get(position);

        TextView textViewTitle = holder.textView_title;
        textViewTitle.setText(book.getBook_title());
        TextView textViewAuthor = holder.textView_author;
        textViewAuthor.setText(book.getBook_author());
        TextView textViewDate = holder.textView_data;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        textViewDate.setText(format.format(book.getDate()));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView_title;
        public TextView textView_author;
        public TextView textView_data;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView_title = (TextView) itemView.findViewById(R.id.text_view_title);
            textView_author = (TextView) itemView.findViewById(R.id.text_view_author);
            textView_data = (TextView) itemView.findViewById(R.id.text_view_data);
        }
    }
}
