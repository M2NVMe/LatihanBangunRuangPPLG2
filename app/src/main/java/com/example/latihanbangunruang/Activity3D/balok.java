package com.example.latihanbangunruang.Activity3D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.latihanbangunruang.R;

public class balok extends AppCompatActivity {
    EditText panjang, lebar, tinggi;
    Button calk, bak;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        tinggi = findViewById(R.id.tinggi);
        calk = findViewById(R.id.calc);
        hasil = findViewById(R.id.hasil);
        bak = findViewById(R.id.back);

        calk.setOnClickListener(view -> {
            double result = 0;
            float pj = Float.parseFloat(panjang.getText().toString());
            float lb = Float.parseFloat(lebar.getText().toString());
            float tg = Float.parseFloat(tinggi.getText().toString());
            result  = 2 * ((pj*lb) + (lb*tg) + (pj*tg));
            hasil.setText(String.valueOf(result));
        });
        bak.setOnClickListener(view -> finish());
    }
}