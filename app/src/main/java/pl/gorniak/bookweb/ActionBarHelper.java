package pl.gorniak.bookweb;

import androidx.appcompat.app.ActionBar;


public class ActionBarHelper {

    public static void setToolbarTile(ActionBar actionBar, String title) {
        if (actionBar != null) {
            actionBar.setTitle(title);
        }
    }
}
