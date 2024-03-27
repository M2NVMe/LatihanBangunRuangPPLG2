package com.example.latihanbangunruang.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.latihanbangunruang.Activity2D.persegi;
import com.example.latihanbangunruang.Activity2D.persegipanjang;
import com.example.latihanbangunruang.Activity2D.segitiga;
import com.example.latihanbangunruang.R;
import com.example.latihanbangunruang.recycl.ItemsMe;
import com.example.latihanbangunruang.recycl.SelectListen;
import com.example.latihanbangunruang.recycl.adapter;

import java.util.ArrayList;
import java.util.List;


public class d2Fragment extends Fragment implements SelectListen {

    public d2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_d2, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycl);
        List<ItemsMe> shape = new ArrayList<>();

        shape.add( new ItemsMe("Persegi", R.drawable.baseline_crop_square_24));
        shape.add( new ItemsMe("Segitiga", R.drawable.baseline_crop_square_24));
        shape.add( new ItemsMe("Lingkaran", R.drawable.baseline_crop_square_24));
        shape.add( new ItemsMe("Persegi panjang", R.drawable.baseline_crop_square_24));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new adapter(getActivity(), shape, this));

        return rootView;
    }

    @Override
    public void OnKlik(ItemsMe holding) {
        String nama = holding.getNama();

        if (nama.equals("Persegi")) {
            Intent ps1 = new Intent(getActivity(), persegi.class);
            startActivity(ps1);
        } else if (nama.equals("Segitiga")) {
            Intent ps2 = new Intent(getActivity(), segitiga.class);
            startActivity(ps2);
        } else if (nama.equals("Lingkaran")) {

        } else if (nama.equals("Persegi panjang")) {
            Intent ps4 = new Intent(getActivity(), persegipanjang.class);
            startActivity(ps4);
        } else {
            Toast.makeText(getActivity(), "INVALID", Toast.LENGTH_SHORT).show();
        }

    }
}