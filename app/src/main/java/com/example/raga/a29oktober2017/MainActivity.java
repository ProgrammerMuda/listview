package com.example.raga.a29oktober2017;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] namawisata = {
            "borobudur",
            "danau toba",
            "prambanan",
            "kawah putih",
            "taman mini indonesia indah",

    };

    Integer[] gambarwisata={
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
    };

    String[] subtitle = {
            "deskripsi",
            "deskripsi",
            "deskripsi",
            "deskripsi",
            "deskripsi",
    };

    String[] url = {
            "https://id.wikipedia.org/wiki/Borobudur",
            "https://id.wikipedia.org/wiki/Danau_Toba",
            "https://id.wikipedia.org/wiki/Candi_Prambanan",
            "https://id.wikipedia.org/wiki/Kawah_Putih",
            "https://id.wikipedia.org/wiki/Taman_Mini_Indonesia_Indah",

    };

    ListView list;
    AlertDialog.Builder alert1;
    AlertDialog alert2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter cladapter = new CustomListAdapter(this, namawisata, subtitle, gambarwisata);
        list = (ListView)findViewById(R.id.list1);
        list.setAdapter(cladapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                alert1 = new AlertDialog.Builder(MainActivity.this);
                alert1
                        .setTitle("wisata")
                        .setMessage("wisata yang anda pilih adalah " + namawisata[position] )
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String title = namawisata[position];
                                Integer gambar = gambarwisata[position];
                                String subtitle1 = subtitle[position];
                                String url1 = url[position];

                                Bundle ngambil = new Bundle();
                                ngambil.putString("judul",title);
                                ngambil.putString("subjudul",subtitle1);
                                ngambil.putInt("gambar",gambar);
                                ngambil.putString("url", url1);

                                Intent kirim = new Intent(MainActivity.this,Main2Activity.class);
                                kirim.putExtras(ngambil);
                                startActivity(kirim);

                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert2= alert1.create();
                alert2.show();


            }
        });



    }
}
