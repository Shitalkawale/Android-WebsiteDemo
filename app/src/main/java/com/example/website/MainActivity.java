package com.example.website;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.tv.TvContract;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    WebAdaptor webAdaptor;
    ImageView imageView;
    int[] logos={R.drawable.abplogo,R.drawable.zee24taslogo,R.drawable.tv9logo,R.drawable.lokmatlogo,R.drawable.samtvlogo,R.drawable.maharashatralogo};
//    String[] links={"https://www.jaimaharashtranews.com/","https://marathi.abplive.com/","https://www.bbc.com/news",
//            "https://www.indiatoday.in/","https://www.lokmat.com/",
//            "https://www.saamtv.com/","https://zeenews.india.com/marathi/live"};

    String[] links={"https://marathi.abplive.com/","https://zeenews.india.com/marathi","https://www.tv9marathi.com/live-tv",
                    "https://www.lokmat.com/","https://www.saamtv.com/","https://www.jaimaharashtranews.com/"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        imageView=findViewById(R.id.logo);

        webAdaptor=new WebAdaptor(MainActivity.this,logos,links);
        gridView.setAdapter(webAdaptor);
        gridView.setColumnWidth(50);


    }
}
