package com.example.raga.a29oktober2017;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RAGA on 29/10/2017.
 */

public class CustomListAdapter extends ArrayAdapter<String>{

    private final Activity contex;
    private final String[] namawisata;
    private final String[] subtitle;
    private final Integer[] gambarwisata;

    public CustomListAdapter(Activity contex, String[] namawisata, String[] subtitle, Integer[] gambarwisata) {
        super(contex, R.layout.list_item, namawisata);
        this.contex = contex;
        this.namawisata = namawisata;
        this.subtitle = subtitle;
        this.gambarwisata = gambarwisata;
    }
    public View getView (int posisi, View view, ViewGroup parent){

        LayoutInflater inflater = contex.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.list_item,null,true);
        TextView title = (TextView)rowview.findViewById(R.id.textview);
        TextView subtitle1 = (TextView)rowview.findViewById(R.id.textview2);
        ImageView image = (ImageView) rowview.findViewById(R.id.imageview);

        title.setText(namawisata[posisi]);
        subtitle1.setText(subtitle[posisi]);
        image.setImageResource(gambarwisata[posisi]);
        return rowview;



    }
}
