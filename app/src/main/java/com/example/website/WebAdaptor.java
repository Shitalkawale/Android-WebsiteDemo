package com.example.website;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class WebAdaptor extends BaseAdapter {

    Context mcontext;
    int[] logo;
    String[] links;
    public WebAdaptor(Context mcontext, int[] logo, String[] links) {
        this.mcontext = mcontext;
        this.logo = logo;
        this.links=links;
    }

    LayoutInflater layoutInflater;
    @Override
    public int getCount() {
        return logo.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        convertView=layoutInflater.inflate(R.layout.custom_design,null);
        ImageView img=(ImageView) convertView.findViewById(R.id.logo);
        img.setImageResource(logo[position]);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("onClick","position ["+position+"]");
                Intent intent=new Intent(mcontext,webpage.class);
                intent.putExtra("Links",links[position]);
                mcontext.startActivity(intent);

            }
        });
        return convertView;



    }
}
