package com.nazma_humayra.art_view_;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Staggered_View_Adapter extends RecyclerView.Adapter<Staggered_View_Adapter.ViewHolder>{

//private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageNamess ;
    private ArrayList<String> mImagess;
    private Context mContext;



    public Staggered_View_Adapter(Context context, ArrayList<String> imageNames, ArrayList<String> images ) {
        mImageNamess = imageNames;
        mImagess = images;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.staggered_view, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // Log.d(TAG, "onBindViewHolder: called.");


        holder.text.setText(mImageNamess.get(position));


        Glide.with(mContext)
                .asBitmap()
                .load(mImagess.get(position))
                .into(holder.image);


    }

    @Override
    public int getItemCount() {
        return mImageNamess.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView text;


        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
           text = itemView.findViewById(R.id.text);




        }
    }
}