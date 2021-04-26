package pl.gorniak.bookweblab2;

import androidx.appcompat.app.ActionBar;


public class Warehouse {

    public static void setToolbarTile(ActionBar actionBar, String title) {
        if (actionBar != null) {
            actionBar.setTitle(title);
        }
    }
}
