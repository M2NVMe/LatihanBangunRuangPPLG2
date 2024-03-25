package com.example.latihanbangunruang.recycl;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull vwhld holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
