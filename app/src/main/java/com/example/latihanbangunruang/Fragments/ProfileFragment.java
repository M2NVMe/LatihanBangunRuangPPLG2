package com.example.latihanbangunruang.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.latihanbangunruang.MainActivity;
import com.example.latihanbangunruang.R;

public class ProfileFragment extends Fragment {
    Button lgot;
    public ProfileFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View RootView =  inflater.inflate(R.layout.fragment_profile, container, false);
        lgot = RootView.findViewById(R.id.Logut);
        lgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return RootView;
    }
}