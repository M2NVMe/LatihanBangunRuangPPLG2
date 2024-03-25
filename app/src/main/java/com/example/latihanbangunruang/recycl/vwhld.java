package com.example.latihanbangunruang.recycl;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihanbangunruang.R;

public class vwhld extends RecyclerView.ViewHolder {
    ImageView ImVW;
    TextView name;
    RelativeLayout relativeLayout;
    public vwhld (@NonNull View itemView) {
        super(itemView);
        ImVW = itemView.findViewById(R.id.ImageVW);
        name = itemView.findViewById(R.id.name);
        relativeLayout = itemView.findViewById(R.id.utama);
    }
}
