package com.example.grishma.unitconverter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.grishma.unitconverter.model.AllMenuModel;

/**
 * Created by grishma on 2/23/16.
 */
public class AllFragmentAdapter extends RecyclerView.Adapter<AllFragmentAdapter.ViewHolder> {
    private AllMenuModel[] mDataset;

    // Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.tv_name);
            mImageView = (ImageView) v.findViewById(R.id.main_menu_image);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AllFragmentAdapter(AllMenuModel[] allMenuModel) {
        mDataset = allMenuModel;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AllFragmentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.all_menu_each, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position].getName());
        holder.mImageView.setBackgroundResource(mDataset[position].getPath());
        holder.mImageView.setColorFilter(Color.parseColor("#ff0000"));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}