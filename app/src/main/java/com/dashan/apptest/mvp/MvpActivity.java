package com.dashan.apptest.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dashan.apptest.R;

public class MvpActivity extends AppCompatActivity implements MvpContract.View {
    TextView tv;
    private MvpPrestener prestener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        tv = findViewById(R.id.main_tv);
        prestener = new MvpPrestener(this);


    }

    @Override
    public void onDataLoad(String s) {
        tv.setText(s);
    }
}
