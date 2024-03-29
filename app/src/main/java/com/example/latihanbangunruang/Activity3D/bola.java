package com.example.latihanbangunruang.Activity3D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.latihanbangunruang.R;

public class bola extends AppCompatActivity {
    EditText jari;
    Button calk, bak;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);
        jari = findViewById(R.id.jari);
        calk = findViewById(R.id.calc);
        hasil = findViewById(R.id.hasil);
        bak = findViewById(R.id.back);

        calk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hsl = 0;
                float ss = Float.parseFloat(jari.getText().toString());
                hsl  = 4 * Math.PI * (ss * ss);
                hasil.setText(String.valueOf(hsl));
            }
        });
        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}