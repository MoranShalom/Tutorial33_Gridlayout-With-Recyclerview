package com.example.gridlayoutwithrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyAdapter extends RecyclerView.Adapter <PlaceViewHolder>{

    private Context mContext;
    private int[] mflowersList;

    public MyAdapter(Context mContext, int[] mPlaceList) {
        this.mContext = mContext;
        this.mflowersList = mPlaceList;
    }


    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_custom_layout,
                parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PlaceViewHolder holder, int position) {
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
        return mflowersList.length;
    }
}

class PlaceViewHolder extends RecyclerView.ViewHolder {

    ImageView mflowers;

    public PlaceViewHolder(View itemView) {
        super(itemView);
         mflowers = itemView.findViewById(R.id.flowers);
    }
}