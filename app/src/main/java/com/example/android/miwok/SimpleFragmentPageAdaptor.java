package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Acer on 06-07-2018.
 */

public class SimpleFragmentPageAdaptor extends FragmentPagerAdapter {
    public SimpleFragmentPageAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new ColorsFragment();
        } else if (position == 2) {
            return new FamilyFragment();
        } else {
            return new PharsesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Numbers";
            case 1:
                return "Colors";
            case 2:
                return "Family";
            case 3:
                return "Phrases";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
