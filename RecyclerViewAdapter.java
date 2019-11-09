package com.example.subscriptionapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageNames;
    private ArrayList<Integer> mImages;
    private ArrayList<String> mDescription;
    private Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<String> imageNames, ArrayList<Integer> images, ArrayList<String> Description ) {
        mImageNames = imageNames;
        mImages = images;
        mDescription = Description;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_view_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.IMGName.setText(mImageNames.get(position));
        holder.IMG.setImageResource(mImages.get(position));
        holder.Description.setText(mDescription.get(position));

        holder.PLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));
                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView IMG;
        TextView IMGName;
        TextView Description;
        RelativeLayout PLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            IMG = itemView.findViewById(R.id.Image);
            IMGName = itemView.findViewById(R.id.Title);
            Description = itemView.findViewById(R.id.Description);
            PLayout = itemView.findViewById(R.id.ParentLayout);
        }
    }
}