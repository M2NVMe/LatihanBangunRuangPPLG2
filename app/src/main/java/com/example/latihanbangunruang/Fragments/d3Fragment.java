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

import com.example.latihanbangunruang.Activity3D.kubus;
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

        shape.add( new ItemsMe("Kubus", "6 x (Sisi X Sisi)" ,R.drawable.cube));
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

        switch (nama) {
            case "Kubus":
                Intent ps1 = new Intent(getActivity(), kubus.class);
                startActivity(ps1);
                break;
            case "Limas":

                break;
            case "Tabung":

                break;
            case "Bola":

                break;
            default:
                Toast.makeText(getActivity(), "INVALID", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}