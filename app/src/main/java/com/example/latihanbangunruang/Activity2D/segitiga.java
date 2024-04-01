package com.example.latihanbangunruang.Activity2D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.latihanbangunruang.R;

public class segitiga extends AppCompatActivity {

    EditText alas, tinggi;
    Button calk, bak;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        calk = findViewById(R.id.calc);
        hasil = findViewById(R.id.hasil);
        bak = findViewById(R.id.back);

        calk.setOnClickListener(view -> {
            double result = 0;
            float al = Float.parseFloat(alas.getText().toString());
            float tg = Float.parseFloat(tinggi.getText().toString());
            result  = 0.5 * al * tg;
            hasil.setText(String.valueOf(result));
        });
        bak.setOnClickListener(view -> finish());
    }
}