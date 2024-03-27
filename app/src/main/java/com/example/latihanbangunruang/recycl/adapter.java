package com.example.latihanbangunruang.recycl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.latihanbangunruang.R;

import java.util.List;


public class adapter extends RecyclerView.Adapter<vwhld> {

    Context context;
    List<ItemsMe> items;
    SelectListen selectListen;

    public adapter(Context context, List<ItemsMe> items, SelectListen selectListen) {
        this.context = context;
        this.items = items;
        this.selectListen = selectListen;
    }

    @NonNull
    @Override
    public vwhld onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new vwhld(LayoutInflater.from(context).inflate(R.layout.recycle_layout_dyna,parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull vwhld holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(items.get(position).getNama());
        holder.ImVW.setImageResource(items.get(position).getImg());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectListen.OnKlik(items.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
