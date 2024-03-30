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

import com.example.latihanbangunruang.Activity3D.balok;
import com.example.latihanbangunruang.Activity3D.bola;
import com.example.latihanbangunruang.Activity3D.kubus;
import com.example.latihanbangunruang.Activity3D.tabung;
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

        shape.add( new ItemsMe("Kubus", "6 x (S X S)" ,R.drawable.cube));
        shape.add( new ItemsMe("Balok", "2 x (PL + LT + PT)" ,R.drawable.cube));
        shape.add( new ItemsMe("Tabung", "2 x Pi x R x (R + T)" ,R.drawable.cube));
        shape.add( new ItemsMe("Bola", "4 x Pi x R x R" ,R.drawable.cube));

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
            case "Balok":
                Intent ps2 = new Intent(getActivity(), balok.class);
                startActivity(ps2);
                break;
            case "Tabung":
                Intent ps3 = new Intent(getActivity(), tabung.class);
                startActivity(ps3);
                break;
            case "Bola":
                Intent ps4 = new Intent(getActivity(), bola.class);
                startActivity(ps4);
                break;
            default:
                Toast.makeText(getActivity(), "INVALID", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}