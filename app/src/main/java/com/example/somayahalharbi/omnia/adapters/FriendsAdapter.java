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

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;


public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsAdapterViewHolder> {
    //TODO: change this to array of type Friend
    private ArrayList<String> names = new ArrayList<>();


    @NonNull
    @Override
    public FriendsAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.friend_item, viewGroup, false);

        return new FriendsAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsAdapterViewHolder friendsAdapterViewHolder, int position) {
        //TODO: change the profile image with the name
        String name = names.get(position);
        friendsAdapterViewHolder.friendName.setText(name);

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public void setData() {
        //TODO: change this function to receive ArrayList of type Friend
        clear();
        names.add("Somayah Alharbi");
        names.add("Sarah Abdullah");
        names.add("Faisal Alh");
        notifyDataSetChanged();

    }

    public void clear() {
        int size = names.size();
        names.clear();
        notifyItemRangeChanged(0, size);


    }


    public class FriendsAdapterViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.friend_profile_img)
        CircleImageView profilePic;
        @BindView(R.id.friend_name)
        TextView friendName;

        public FriendsAdapterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }

    }
}