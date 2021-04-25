package pl.gorniak.bookweblab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.info:
                Intent infopage = new Intent(MainActivity.this,AboutProgramActivity.class);
                startActivity(infopage);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void next_button(View view) {
        Intent menupage = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(menupage);
    }
}