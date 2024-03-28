package com.example.latihanbangunruang.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.latihanbangunruang.R;
import com.example.latihanbangunruang.recycl.ItemsMe;
import com.example.latihanbangunruang.recycl.SelectListen;
import com.example.latihanbangunruang.recycl.adapter;

import java.util.ArrayList;
import java.util.List;


public class d3Fragment extends Fragment implements SelectListen {

    public d3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View RootView = inflater.inflate(R.layout.fragment_d3, container, false);
        RecyclerView recyclerView = RootView.findViewById(R.id.recycl);
        List<ItemsMe> shape = new ArrayList<>();

        shape.add( new ItemsMe("Kubus", "t" ,R.drawable.cube));
        shape.add( new ItemsMe("Limas", "t" ,R.drawable.cube));
        shape.add( new ItemsMe("Tabung", "t" ,R.drawable.cube));
        shape.add( new ItemsMe("Bola", "t" ,R.drawable.cube));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new adapter(getActivity(), shape, this));
        return RootView;
    }

    @Override
    public void OnKlik(ItemsMe holding) {
        String nama = holding.getNama();
        Toast.makeText(getActivity(), nama, Toast.LENGTH_SHORT).show();

        if (nama.equals("Kubus")) {

        } else if (nama.equals("Limas")) {

        } else if (nama.equals("Tabung")) {

        } else if (nama.equals("Bola")) {

        } else {
            Toast.makeText(getActivity(), "INVALID", Toast.LENGTH_SHORT).show();
        }
    }
}