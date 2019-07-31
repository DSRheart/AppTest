package com.dashan.apptest.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.dashan.apptest.R;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private RecyclerView lv;
    private TestAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        List<String> list = new ArrayList<>();
        list.add("dd");
        list.add("dd");
        list.add("dd");
        list.add("dd");
        list.add("dd");
        list.add("dd");
        list.add("dd");
        list.add("dd");
        adapter = new TestAdapter(list);
        lv = findViewById(R.id.list_lv);
//        lv.setLayoutManager(new LinearLayoutManager(this));  //  垂直布局
        lv.setLayoutManager(new GridLayoutManager(this,4));  //横向 每行4个
        lv.setAdapter(adapter);
        adapter.setOnClickListener(new TestAdapter.OnClickListener() {
            @Override
            public void onClick(int postion) {
                Toast.makeText(ListActivity.this,"ddd",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
