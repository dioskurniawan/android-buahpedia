package com.omrobbie.buahpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // set layout ke listview, jika gambar cover di klik
        ImageView imgCover = (ImageView) findViewById(R.id.imgCover);
        imgCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivity = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(listActivity);
            }
        });
    }
}