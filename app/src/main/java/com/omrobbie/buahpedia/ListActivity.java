package com.omrobbie.buahpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ListView lvList = (ListView) findViewById(R.id.lvList);

        // masukkan item ke dalam data
        ArrayList<ListData> data = new ArrayList<>();
        data.add(new ListData(R.drawable.icon, "Title", "Short description"));

        // set adapter
        ListAdapter adapter = new ListAdapter(this, R.layout.listitem, data);
        lvList.setAdapter(adapter);
    }
}