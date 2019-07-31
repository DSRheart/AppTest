package com.dashan.apptest.evenbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dashan.apptest.R;

import org.greenrobot.eventbus.EventBus;

public class EvenBus2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_bus2);

        findViewById(R.id.evenbus2_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EvenBus1Activity.TestBean bean = new EvenBus1Activity.TestBean(1);
                EventBus.getDefault().post(bean);
            }
        });
    }
}
