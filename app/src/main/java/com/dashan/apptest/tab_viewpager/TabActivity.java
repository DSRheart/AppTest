package com.dashan.apptest.tab_viewpager;

import android.os.Bundle;

import com.dashan.apptest.R;
import com.dashan.apptest.tab_viewpager.frag.Tar1Fragment;
import com.dashan.apptest.tab_viewpager.frag.Tar2Fragment;
import com.dashan.apptest.tab_viewpager.frag.Tar3Fragment;
import com.dashan.apptest.tab_viewpager.frag.Tar4Fragment;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;

public class TabActivity extends AppCompatActivity {
    private ViewPager vp;
    private TabLayout tab;
    private TabViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        vp = findViewById(R.id.view_pager);
        tab = findViewById(R.id.tabs);
        adapter = new TabViewPagerAdapter(getSupportFragmentManager());
        tab.setupWithViewPager(vp);
        vp.setAdapter(adapter);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}