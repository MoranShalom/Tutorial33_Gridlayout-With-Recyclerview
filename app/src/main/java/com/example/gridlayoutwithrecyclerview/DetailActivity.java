package com.example.gridlayoutwithrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView mflowers = findViewById(R.id.imageView);

        Bundle mBundle = getIntent().getExtras();
        if(mBundle != null){
            mflowers.setImageResource(mBundle.getInt("Image"));
        }
    }
}
