package com.dashan.apptest.mvp;

public class MvpPrestener implements MvpContract.Presenter {
    MvpContract.View mView;
    public MvpPrestener(MvpContract.View mView){
        this.mView = mView;
    }

    @Override
    public void LoadData() {
        String s = "ddddddddddd";
        mView.onDataLoad(s);
    }
}
