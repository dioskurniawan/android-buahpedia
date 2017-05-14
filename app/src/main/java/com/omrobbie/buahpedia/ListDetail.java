package com.omrobbie.buahpedia;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.omrobbie.buahpedia.R.layout.listitem;

public class ListDetail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listitem_detail);

        // baca data kiriman dari ListActivity.java
        int getImage = getIntent().getExtras().getInt("image");
        String getTitle = getIntent().getExtras().getString("title");
        String getDescription = getIntent().getExtras().getString("description");

        // tampilkan data tersebut ke layout listitem_detail
        TextView txtDetailTitle = (TextView) findViewById(R.id.txtDetailTitle);
        txtDetailTitle.setText(getTitle);

        ImageView imgDetailImage = (ImageView) findViewById(R.id.imgDetailImage);
        imgDetailImage.setImageResource(getImage);

        TextView txtDetailDescription = (TextView) findViewById(R.id.txtDetailDescription);
        txtDetailDescription.setText(getDescription);

        // handle masalah scroll text description yang panjang di layout detail
        txtDetailDescription.setMovementMethod(new ScrollingMovementMethod());
    }
}