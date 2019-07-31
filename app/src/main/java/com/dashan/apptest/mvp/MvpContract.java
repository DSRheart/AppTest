package com.dashan.apptest.mvp;

public class MvpContract {
    interface Presenter{
        void initListView();

        void updateList();
    }
    interface  View{
        void initListView(MvpAdapter adapter);
    }
}
