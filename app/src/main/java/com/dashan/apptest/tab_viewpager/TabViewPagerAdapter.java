package com.dashan.apptest.tab_viewpager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.dashan.apptest.tab_viewpager.frag.Tar1Fragment;
import com.dashan.apptest.tab_viewpager.frag.Tar2Fragment;
import com.dashan.apptest.tab_viewpager.frag.Tar3Fragment;
import com.dashan.apptest.tab_viewpager.frag.Tar4Fragment;

import java.util.ArrayList;
import java.util.List;

public class TabViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments = new ArrayList<>();
    private String[] strs = {"tar1","tar2","tar3","tar4","tar1","tar2","tar3","tar4"};
    public TabViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments.add(new Tar1Fragment());
        fragments.add(new Tar2Fragment());
        fragments.add(new Tar3Fragment());
        fragments.add(new Tar4Fragment());
        fragments.add(new Tar1Fragment());
        fragments.add(new Tar2Fragment());
        fragments.add(new Tar3Fragment());
        fragments.add(new Tar4Fragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strs[position];
    }

}
