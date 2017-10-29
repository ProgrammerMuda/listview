package com.example.raga.a29oktober2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text1;
    ImageView gambar1;
    WebView wvbrowser;
    WebSettings webset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1 = (TextView)findViewById(R.id.text);
        gambar1= (ImageView) findViewById(R.id.image1);
        wvbrowser = (WebView)findViewById(R.id.web1);

        Bundle tampungdata = getIntent().getExtras();

        String text2 = tampungdata.getString("judul");
        Integer image1 = tampungdata.getInt("gambar");
        String url = tampungdata.getString("url");

        text1.setText(text2);
        gambar1.setImageResource(image1);

        webset = wvbrowser.getSettings();
        webset.setJavaScriptEnabled(true);
        wvbrowser.setWebViewClient(new WebViewClient());
        wvbrowser.loadUrl(url);









    }
}
