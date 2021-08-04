package com.example.viewpager_preclass;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerSampleAdapter extends FragmentPagerAdapter {
    public ViewPagerSampleAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentA.newInstance("Hey fragment A");
            case 1:
                return FragmentB.newInstance("Hey fragment B");
            case 2:
                return FragmentC.newInstance("Hey fragment C");
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String TabName = "";
        switch (position){
            case 0: TabName = "Frag - A"; break;
            case 1: TabName = "Frag - B"; break;
            case 2: TabName = "Frag - C"; break;
        }
        return TabName;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
