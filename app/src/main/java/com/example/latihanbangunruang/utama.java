package com.example.latihanbangunruang;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.latihanbangunruang.Fragments.ProfileFragment;
import com.example.latihanbangunruang.Fragments.d2Fragment;
import com.example.latihanbangunruang.Fragments.d3Fragment;
import com.example.latihanbangunruang.databinding.ActivityUtamaBinding;

public class utama extends AppCompatActivity {
    ActivityUtamaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUtamaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new d2Fragment());
        binding.bottomNavigationView.setOnItemReselectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.d2) {
                replaceFragment(new d2Fragment());
            } else if (itemId == R.id.d3) {
                replaceFragment(new d3Fragment());
            } else if (itemId == R.id.prof) {
                replaceFragment(new ProfileFragment());
            }
        });

    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }
}