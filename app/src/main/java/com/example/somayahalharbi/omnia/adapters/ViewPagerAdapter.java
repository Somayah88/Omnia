package com.example.somayahalharbi.omnia.adapters;
//TODO: complete the adapter code and display the fragments in the main activity


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.somayahalharbi.omnia.FriendsFragment;
import com.example.somayahalharbi.omnia.ProfileFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 2;

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                // create profile fragment by calling new Instance function
                return ProfileFragment.newInstance(position,"Profile");

            case 1:
                //create friends fragment
                return FriendsFragment.newInstance(position,"Friends");
            default:
                return null;


        }

    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
