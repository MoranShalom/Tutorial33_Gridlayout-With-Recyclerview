package com.example.gridlayoutwithrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    int[] mflowersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        mRecyclerView.getLayoutManager().setMeasurementCacheEnabled(false);

        mflowersList = new int[]{R.drawable.image1, R.drawable.image2, R.drawable.image3,
                R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7,
                R.drawable.image8, R.drawable.image9, R.drawable.image5, R.drawable.image3,
                R.drawable.image1, R.drawable.image6, R.drawable.image8};

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mflowersList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
