package com.dashan.apptest.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dashan.apptest.R;

import java.util.ArrayList;
import java.util.List;

public class MvpAdapter extends RecyclerView.Adapter<MvpAdapter.MyHodler>{
    private List<String> list;
    public MvpAdapter(List<String> list){
        this.list = list;
    }
    @NonNull
    @Override
    public MyHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item,parent,false);
        return new MyHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHodler holder, int position) {
        holder.tv.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyHodler extends  RecyclerView.ViewHolder{
        private TextView tv;
        public MyHodler(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.shop_tv);
        }
    }
}
