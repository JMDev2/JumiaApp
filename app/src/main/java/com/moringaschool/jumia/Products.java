package com.moringaschool.jumia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Products extends AppCompatActivity {
    private int[] images = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};
    private String[] titles = {"Top","Bottom","Shirt","Tshirt","Jacket"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new JumiaAdapter(this, images,titles));
    }
}