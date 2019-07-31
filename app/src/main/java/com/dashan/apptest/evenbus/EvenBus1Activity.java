package com.dashan.apptest.evenbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.dashan.apptest.R;
import com.dashan.apptest.utils.SharePreferencesUtil;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * 全局传值
 * 1、注册和注销(要监听的页面才要注册和注销)
 * 2、监听
 * */
public class EvenBus1Activity extends AppCompatActivity {
    private AppCompatActivity self = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_bus1);
        //注册
        EventBus.getDefault().register(this);


        findViewById(R.id.evenbus1_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(self,EvenBus2Activity.class));
            }
        });


    }

    //监听
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void test(TestBean bean){//
        Log.e("test","到达第一个页面");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //注销
        EventBus.getDefault().unregister(this);
    }

    static class TestBean{
        public TestBean(int value){
            this.value = value;
        }
        private int value = 0;
    }
}
