package com.example.gridlayoutwithrecyclerview;

/**
 * Create a new java class and name it (MyAdapter) and make it extends RecyclerView.Adapter.
 * Make sure to implement Recyclerview required methods (onCreateViewHolder(), onBindViewHolder(),
 * and getItemCount()), based on the error that you see below PlaceViewHolder you need
 * to create a new class called (PlaceViewHolder).
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyAdapter extends RecyclerView.Adapter <PlaceViewHolder>{

    //Inside MyAdapter.java class you need to declare 2 variables and a constructor,
    // this constructor will be used to pass data from MainActivity.java to this adapter.
    private Context mContext;
    private int[] mflowersList;

    public MyAdapter(Context mContext, int[] mPlaceList) {
        this.mContext = mContext;
        this.mflowersList = mPlaceList;
    }


    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Inside Recyclerview (onCreateViewHolder) method you need to inflate
        // the custom layout file recyclerview_custom_layout.xml.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_custom_layout,
                parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PlaceViewHolder holder, int position) {

        // Inside (onBindViewHolder) is where you will initialize (ivPlace).
        holder.mflowers.setImageResource(mflowersList[position]);

        holder.mflowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Image", mflowersList[holder.getAdapterPosition()]);
                mContext.startActivity(mIntent);
            }
        });

    }

    @Override
    public int getItemCount() {

        //Finally you need to change the return value inside (getItemCount())
        // to actually return the size of the images array instead of null value.
        return mflowersList.length;
    }
}

class PlaceViewHolder extends RecyclerView.ViewHolder {

    ImageView mflowers;

    //Inside PlaceViewHolder class and based on the error you will need to add a default constructor.
    public PlaceViewHolder(View itemView) {
        super(itemView);

        //Inside the constructor of PlaceViewHolder class you need to declare and
        // initialize Android ImageView (flowers).
         mflowers = itemView.findViewById(R.id.flowers);
    }
}