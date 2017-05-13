package com.omrobbie.buahpedia;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.id.list;

public class ListAdapter extends ArrayAdapter<ListData> {
    Context context;
    int resource;
    ArrayList<ListData> objects = null;

    public ListAdapter(Context context, int resource, ArrayList<ListData> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ListHolder holder = null;

        if(row == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(resource, parent, false);

            // persiapkan item
            holder = new ListHolder();
            holder.imgImage = (ImageView) row.findViewById(R.id.imgImage);
            holder.txtTitle = (TextView) row.findViewById(R.id.txtTitle);
            holder.txtDescription = (TextView) row.findViewById(R.id.txtDescription);

            // beri tanda agar tidak mengulang di kondisi if row = null
            row.setTag(holder);
        } else {
            holder = (ListHolder) row.getTag();
        }

        // tampilkan item
        ListData listData = objects.get(position);
        holder.imgImage.setImageResource(listData.image);
        holder.txtTitle.setText(listData.title);
        holder.txtDescription.setText(listData.description);

        return row;
    }

    // bikin static class untuk list data holder
    static class ListHolder {
        ImageView imgImage;
        TextView txtTitle;
        TextView txtDescription;
    }
}
