package pl.gorniak.bookweb;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_bookweb, R.id.nav_math, R.id.nav_inf,R.id.nav_electronics, R.id.nav_booklist)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        ActionBarHelper.setToolbarTile(getSupportActionBar(), "Strona G????wna");
        //Obs??uga przej??cia po klikni??ciu Lista ksi????ek z menu do sekcji nav_booklist
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_booklist){
                    Intent intent = new Intent(HomeActivity.this, BooksListActivity.class);
                    startActivity(intent);
                }
                return true;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.info:
                Intent infopage = new Intent(HomeActivity.this,AboutProgramActivity.class);
                startActivity(infopage);
                return true;
            case R.id.action_settings:
                Toast.makeText(HomeActivity.this, "IKONA KAMERA", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_something:
                /*Create an ACTION_SEND Intent*/
                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                /*This will be the actual content you wish you share.*/
                String shareBody = "Here is the share content body";
                /*The type of the content is text, obviously.*/
                intent.setType("text/plain");
                /*Applying information Subject and Body.*/
                //intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.share_subject));
                intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                /*Fire!*/
                startActivity(Intent.createChooser(intent,"Udost??pnienie informacji o aplikacji"));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void bookWebClick(MenuItem item) {
        Toast.makeText(HomeActivity.this, "BookWeb", Toast.LENGTH_SHORT).show();
    }

    public void mathClick(MenuItem item) {
        Toast.makeText(HomeActivity.this, "Matematyka", Toast.LENGTH_SHORT).show();
    }

    public void infClick(MenuItem item) {
        Toast.makeText(HomeActivity.this, "Informatyka", Toast.LENGTH_SHORT).show();
    }

    public void electronicsClick(MenuItem item) {
        Toast.makeText(HomeActivity.this, "Elektronika", Toast.LENGTH_SHORT).show();
    }

}