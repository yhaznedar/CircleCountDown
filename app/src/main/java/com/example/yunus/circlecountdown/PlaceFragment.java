package com.example.yunus.circlecountdown;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yunus on 28.12.2016.
 */

public class PlaceFragment extends android.support.v4.app.Fragment
{
    PlaceViewPagerAdapter placeTabAdapter;
    ViewPager viewPager;

    public PlaceFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.tab1, container, false);
        placeTabAdapter = new PlaceViewPagerAdapter(getFragmentManager());
        viewPager = (ViewPager) rootView.findViewById(R.id.pager);
        viewPager.setAdapter(placeTabAdapter);
        return rootView;

    }

}
