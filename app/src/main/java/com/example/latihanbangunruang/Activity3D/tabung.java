package com.example.latihanbangunruang.Activity3D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.latihanbangunruang.R;

public class tabung extends AppCompatActivity {

    EditText jari, tinggi;
    Button calk, bak;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        jari = findViewById(R.id.jari);
        tinggi = findViewById(R.id.tinggi);
        calk = findViewById(R.id.calc);
        hasil = findViewById(R.id.hasil);
        bak = findViewById(R.id.back);

        calk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = 0;
                float jr = Float.parseFloat(jari.getText().toString());
                float tg = Float.parseFloat(tinggi.getText().toString());
                double pi = 3.14;
                result  = 2 * pi * jr * (jr + tg);
                hasil.setText(String.valueOf(result));
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