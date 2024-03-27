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
        shape.add( new ItemsMe("Jajar genjang", R.drawable.baseline_crop_square_24));
        shape.add( new ItemsMe("Persegi panjang", R.drawable.baseline_crop_square_24));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new adapter(getActivity(), shape, this));

        return rootView;
    }

    @Override
    public void OnKlik(ItemsMe holding) {
        String nama = holding.getNama();
        Toast.makeText(getActivity(), nama, Toast.LENGTH_SHORT).show();

        if (nama == "Persegi") {
            Toast.makeText(getActivity(), "obj1", Toast.LENGTH_SHORT).show();
        } else if (nama == "Segitiga" ) {
            Toast.makeText(getActivity(), "obj2", Toast.LENGTH_SHORT).show();
        } else if (nama == "Jajar genjang") {
            Toast.makeText(getActivity(), "obj3", Toast.LENGTH_SHORT).show();
        } else if (nama == "Persegi panjang") {
            Toast.makeText(getActivity(), "obj4", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "dni", Toast.LENGTH_SHORT).show();
        }

    }
}