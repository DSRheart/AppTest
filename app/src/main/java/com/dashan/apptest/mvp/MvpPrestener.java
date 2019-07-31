package com.dashan.apptest.mvp;

import android.util.Log;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.ArrayList;
import java.util.List;

public class MvpPrestener implements MvpContract.Presenter {
    MvpContract.View mView;
    private MvpAdapter adapter;
    public MvpPrestener(MvpContract.View mView){
        this.mView = mView;
    }


    @Override
    public void initListView() {
        List<String> strs = new ArrayList<>();
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        strs.add("dddd");
        adapter = new MvpAdapter(strs);
        mView.initListView(adapter);
    }

    @Override
    public void updateList() {
        adapter.notifyDataSetChanged();
    }
}
