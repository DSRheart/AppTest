package com.dashan.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.dashan.apptest.evenbus.EvenBus1Activity;
import com.dashan.apptest.mvp.MvpActivity;
import com.dashan.apptest.recycler.ListActivity;
import com.dashan.apptest.viewapger.PageViewActivity;

public class MainActivity extends AppCompatActivity {
    private AppCompatActivity self = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(self, EvenBus1Activity.class));
            }
        });
        findViewById(R.id.main_btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(self,ListActivity.class));
            }
        });
        findViewById(R.id.main_btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(self, PageViewActivity.class));
            }
        });
        findViewById(R.id.main_btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(self, MvpActivity.class));
            }
        });
        findViewById(R.id.main_btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                String guanzhu_URL = "http://weixin.qq.com/r/OEUXDz7ExGO7rXps9xAq";
//                i.setData(Uri.parse(guanzhu_URL));
//                i.setPackage("com.tencent.mm");
//                i.putExtra(Intent.EXTRA_SUBJECT,"Share");
//                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(i);

                Intent intent = new Intent(Intent.ACTION_MAIN);
/**知道要跳转应用的包命与目标Activity*/
                ComponentName componentName = new ComponentName("kuyu.com.xxxx", "kuyu.com.xxxx.xxx.login.WelcomeActivity");
                intent.setComponent(componentName);
                intent.putExtra("", "");//这里Intent传值
                startActivity(intent);
            }
        });

    }
}
