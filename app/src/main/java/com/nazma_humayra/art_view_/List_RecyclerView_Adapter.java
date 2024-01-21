package com.nazma_humayra.art_view_;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class List_RecyclerView_Adapter extends RecyclerView.Adapter<List_RecyclerView_Adapter.ViewHolder>{

//private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageNames2 ;
    private ArrayList<String> mImages2;
    private ArrayList<String> mType2;
    private Context mContext;
//    private ArrayList<String> mLinks;


    public List_RecyclerView_Adapter(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> type) {
        mImageNames2 = imageNames;
        mImages2 = images;
        mContext = context;
        mType2 = type;
//        mLinks= links;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_recyclerview, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // Log.d(TAG, "onBindViewHolder: called.");


        holder.imageName2.setText(mImageNames2.get(position));
        holder.image_name22.setText(mType2.get(position));

        Glide.with(mContext)
                .asBitmap()
                .load(mImages2.get(position))
                .into(holder.image2);


    }



    @Override
    public int getItemCount() {
        return mImageNames2.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image2;
        TextView imageName2,image_name22;


        public ViewHolder(View itemView) {
            super(itemView);
            image2 = itemView.findViewById(R.id.image2);
            imageName2 = itemView.findViewById(R.id.image_name2);
            image_name22= itemView.findViewById(R.id.image_name22);




        }
    }

}