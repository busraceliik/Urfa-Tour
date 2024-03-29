package com.example.busra.urfam;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1) {
            return new MallsFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else if (position == 3) {
            return new PlacesFragment();
        } else {
            return new MuseumsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_about);
        } else if (position == 1) {
            return mContext.getString(R.string.category_malls);
        } else if (position == 2) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 3) {
            return mContext.getString(R.string.category_places);
        } else {
            return mContext.getString(R.string.category_museums);
        }
    }
}
