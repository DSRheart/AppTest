package com.dashan.apptest.mvp;

public class MvpContract {
    interface Presenter{
        void LoadData();
    }
    interface  View{
        void onDataLoad(String s);
    }
}
