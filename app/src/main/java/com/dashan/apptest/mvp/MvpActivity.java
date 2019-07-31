package com.dashan.apptest.mvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.dashan.apptest.R;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;

public class MvpActivity extends AppCompatActivity implements MvpContract.View {
    private MvpPrestener prestener;
    private RecyclerView lvshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        lvshow = findViewById(R.id.main_lv);
        prestener = new MvpPrestener(this);


    }


    @Override
    public void initListView(MvpAdapter adapter) {
        lvshow.setAdapter(adapter);
    }
}
