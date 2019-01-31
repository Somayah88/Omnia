package com.example.somayahalharbi.omnia.adapters;
//TODO: complete the adapter code and populate the RecyclervView with mock data


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.somayahalharbi.omnia.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WishListAdapter extends RecyclerView.Adapter<WishListAdapter.WishlistAdapterViewHolder> {
    private ArrayList<String> wishLists = new ArrayList<>();


    @NonNull
    @Override
    public WishlistAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.wishlist_item, viewGroup, false);
        return new WishlistAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WishlistAdapterViewHolder wishlistAdapterViewHolder, int position) {
        wishlistAdapterViewHolder.wishListName.setText(wishLists.get(position));


    }

    public void setData() {
        //TODO: get real data from the database
        clear();
        wishLists.add("My Birthday");
        wishLists.add("My Wedding WishList");
        notifyDataSetChanged();
    }

    public void clear() {
        int size = wishLists.size();
        wishLists.clear();
        notifyItemRangeChanged(0, size);


    }

    @Override
    public int getItemCount() {
        return wishLists.size();
    }

    public class WishlistAdapterViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.wishlist_name)
        TextView wishListName;

        public WishlistAdapterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }
    }
}
