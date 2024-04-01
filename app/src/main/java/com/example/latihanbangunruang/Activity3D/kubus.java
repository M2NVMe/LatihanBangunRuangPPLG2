package com.example.latihanbangunruang.Activity3D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.latihanbangunruang.R;

public class kubus extends AppCompatActivity {
    EditText sisi;
    Button calk, bak;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        sisi = findViewById(R.id.sisi);
        calk = findViewById(R.id.calc);
        hasil = findViewById(R.id.hasil);
        bak = findViewById(R.id.back);

        calk.setOnClickListener(view -> {
            float result = 0;
            float ss = Float.parseFloat(sisi.getText().toString());
            result  = 6 * (ss * ss);
            hasil.setText(String.valueOf(result));
        });
        bak.setOnClickListener(view -> finish());
    }
}