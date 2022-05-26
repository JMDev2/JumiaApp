package com.moringaschool.jumia;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class JumiaAdapter extends BaseAdapter {
    private Context mContext;
    private int[] Images;
    private String[] titles;


    public JumiaAdapter(Context mContext, int[] images, String[] titles) {
        this.mContext = mContext;
        Images = images;
        this.titles = titles;
    }

    @Override
    public int getCount() {
        return Images.length;
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
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null) {
            // get layout from xml file
            gridView = inflater.inflate(R.layout.itemlayout, null);
            // pull views
            TextView titleView = (TextView) gridView
                    .findViewById(R.id.titleTextView);
            ImageView imageView = (ImageView) gridView.findViewById(R.id.imageView);
            imageView.setImageResource(Images[position]);
            // set values into views
            titleView.setText(titles[position]);  // using dummy data for now
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }
    }

