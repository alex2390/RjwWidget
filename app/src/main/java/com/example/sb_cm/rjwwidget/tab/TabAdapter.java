package com.example.sb_cm.rjwwidget.tab;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Desc:
 * <p>
 * Created by renjiawen on 2018/12/18.
 */
public class TabAdapter extends FragmentPagerAdapter {
    String[] list =  {"第一條","第一條","第一條","第一條","第一條","第一條"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return new TabFragment();
    }

    @Override
    public int getCount() {
        return list.length;
    }
}
