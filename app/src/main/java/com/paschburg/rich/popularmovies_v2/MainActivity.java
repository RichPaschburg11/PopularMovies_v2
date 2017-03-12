package com.paschburg.rich.popularmovies_v2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public UserPrefs userPrefs;
    public Context context;
    private final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float height = displayMetrics.heightPixels;
        float heightdp = height / displayMetrics.density;
        float width = displayMetrics.widthPixels;
        float widthdp = width / displayMetrics.density;

        float size = width;
        if (size > height) size = height;
        float sizedp = widthdp;
        if (sizedp > heightdp) sizedp = heightdp;

        int intsize = (int)size;
        int intsizedp = (int)sizedp;

        if (intsizedp >= ( 180 * 2 ) )intsizedp = 0;
        else Log.e(LOG_TAG, "small screen size in dp = " + Integer.toString(intsizedp));

        context = getApplicationContext();
        UserPrefs userPrefs = new UserPrefs(context);
        userPrefs.setWidth(intsizedp);
        */

    }
}
