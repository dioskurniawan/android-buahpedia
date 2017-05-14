package com.omrobbie.buahpedia;

import android.app.Activity;
import android.os.Bundle;

public class ListDetail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listitem_detail);

        // baca data kiriman dari ListActivity.java
        int getImage = getIntent().getExtras().getInt("image");
        String getTitle = getIntent().getExtras().getString("title");
        String getDescription = getIntent().getExtras().getString("description");
    }
}