package com.example.yunus.circlecountdown;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Yunus on 28.12.2016.
 */

public class PlaceViewPagerAdapter extends FragmentStatePagerAdapter{

        private ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        private String[] basliklar = {"Muayene Tarihi", "Kasko Tarihi", "Sigorta Tarihi"};

    public PlaceViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
        fragments.add(new MuayeneTabFragment());
        fragments.add(new KaskoTabFragment());
        fragments.add(new SigortaTabFragment());
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);

    }

    @Override
    public int getCount() {
        return fragments.size();
    }

        @Override
        public CharSequence getPageTitle(int position) {
            return basliklar[position];
        }
}
