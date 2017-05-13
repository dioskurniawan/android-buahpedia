package com.omrobbie.buahpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

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
                setContentView(R.layout.listview);
            }
        });

        final ListView lvList = (ListView) findViewById(R.id.lvList);

        // masukkan item ke dalam data
        final ArrayList<ListData> data = new ArrayList<>();
        data.add(new ListData(R.drawable.icon, "Test", "Test 1"));

        // set adapter
        final ListAdapter adapter = new ListAdapter(this, R.layout.listitem, data);
        // lvList.setAdapter(adapter);
    }
}