package com.example.android.lublintourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {


    private Context useContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        useContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return useContext.getString(R.string.category_monuments);
        } else if (position == 1) {
            return useContext.getString(R.string.category_parks);
        } else if (position == 2) {
            return useContext.getString(R.string.category_restaurants);
        } else {
            return useContext.getString(R.string.category_hotels);
        }
    }
}