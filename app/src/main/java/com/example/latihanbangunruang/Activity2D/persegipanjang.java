package com.example.latihanbangunruang.Activity2D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.latihanbangunruang.R;

public class persegipanjang extends AppCompatActivity {

    EditText panj, leb;
    Button calk, bak;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);
        panj = findViewById(R.id.panjang);
        leb = findViewById(R.id.lebar);
        calk = findViewById(R.id.calc);
        hasil = findViewById(R.id.hasil);
        bak = findViewById(R.id.back);

        calk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hsl = 0;
                float pj = Float.parseFloat(panj.getText().toString());
                float lb = Float.parseFloat(leb.getText().toString());
                hsl  = pj * lb;
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