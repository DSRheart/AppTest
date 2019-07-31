package com.dashan.apptest.viewapger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.dashan.apptest.R;

import java.util.ArrayList;
import java.util.List;

public class TestPageAdapter extends PagerAdapter {
    private List<View> views = new ArrayList<>();
    private Context context;
    public TestPageAdapter(Context context,List<String> list){
        this.context = context;
        for (String res : list){
            View view = LayoutInflater.from(context).inflate(R.layout.viewpage_item,null);
            views.add(view);
        }
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(views.get(position));
        return views.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(views.get(position));
    }


}
