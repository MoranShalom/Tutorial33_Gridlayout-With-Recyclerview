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

        //declare and initialize Android Recyclerview.
         mRecyclerView = findViewById(R.id.recyclerView);

        /**   -- GridLayoutManager ---
         *  declare and initialize Android GridLayoutManager, this will be used to
         *  determine how you want to arrange the images inside Recyclerview.
         *  Android GridLayoutManager takes 2 argument: First one is the context,
         *  the second one is used to indicate the number of columns that you want to show inside Recyclerview.
         */
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);



        //Next you will need to declare and initialize the images array that you will
        // have to use it later inside (MyAdapter).
        mflowersList = new int[]{R.drawable.image1, R.drawable.image2, R.drawable.image3,
                R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7,
                R.drawable.image8, R.drawable.image9, R.drawable.image5, R.drawable.image3,
                R.drawable.image1, R.drawable.image6, R.drawable.image8};


        //The only thing remaining before the app is ready is you will need to declare
        // and initialize (MyAdapter) and make sure to use this adapter with Android Recyclerview.
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mflowersList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
