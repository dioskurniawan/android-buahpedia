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
        data.add(new ListData(R.drawable.buah_anggur, "Anggur", "Keterangan tentang buah anggur."));
        data.add(new ListData(R.drawable.buah_apel, "Apel", "Keterangan tentang buah apel."));
        data.add(new ListData(R.drawable.buah_jeruk, "Jeruk", "Keterangan tentang buah jeruk."));
        data.add(new ListData(R.drawable.buah_kiwi, "Kiwi", "Keterangan tentang buah kiwi."));
        data.add(new ListData(R.drawable.buah_mangga, "Mangga", "Keterangan tentang buah mangga."));
        data.add(new ListData(R.drawable.buah_manggis, "Manggis", "Keterangan tentang buah manggis."));
        data.add(new ListData(R.drawable.buah_nanas, "Nanas", "Keterangan tentang buah nanas."));
        data.add(new ListData(R.drawable.buah_pepaya, "Pepaya", "Keterangan tentang buah pepaya."));
        data.add(new ListData(R.drawable.buah_semangka, "Semangka", "Keterangan tentang buah semangka."));

        // set adapter
        ListAdapter adapter = new ListAdapter(this, R.layout.listitem, data);
        lvList.setAdapter(adapter);
    }
}