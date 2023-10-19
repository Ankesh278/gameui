package com.example.dailypoint.Adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.dailypoint.Fragment.HomeFragment;
import com.example.dailypoint.Fragment.PlayJodiFragment;
import com.example.dailypoint.Fragment.PlayPannaFragment;

public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;
    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }
    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                PlayPannaFragment playPannaFragment = new PlayPannaFragment();
                return playPannaFragment;
            case 2:
                PlayJodiFragment playJodiFragment = new PlayJodiFragment();
                return playJodiFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
