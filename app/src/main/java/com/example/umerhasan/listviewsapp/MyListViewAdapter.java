package com.example.umerhasan.listviewsapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyListViewAdapter extends ArrayAdapter<String> {
    public MyListViewAdapter(Context context, String[] resource)
    {
        super(context, R.layout.row_layout_2,resource);
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater myInflator = LayoutInflater.from(getContext());

        View myView = myInflator.inflate(R.layout.row_layout_2,
                parent , false);

        String myNames = getItem(position);

        TextView myTextView = (TextView) myView.findViewById(R.id.textView1);

        myTextView.setText(myNames);
        
        ImageView myImageView = (ImageView) myView.findViewById(R.id.ImageView);
        myImageView.setImageResource(R.drawable.options);
        return myView;
    }
}
