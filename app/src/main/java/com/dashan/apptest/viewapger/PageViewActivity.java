package com.dashan.apptest.viewapger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.dashan.apptest.R;

import java.util.ArrayList;
import java.util.List;

public class PageViewActivity extends AppCompatActivity {
    private ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_view);
        vp = findViewById(R.id.pageview_vp);
        List<String> list = new ArrayList<>();
        list.add("ddd");
        list.add("ddd");
        list.add("ddd");
        list.add("ddd");
        list.add("ddd");
        list.add("ddd");
        TestPageAdapter adapter = new TestPageAdapter(this,list);
        vp.setAdapter(adapter);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
