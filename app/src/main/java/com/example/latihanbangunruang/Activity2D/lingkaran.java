package com.example.latihanbangunruang.Activity2D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.latihanbangunruang.R;

public class lingkaran extends AppCompatActivity {
    EditText jari;
    Button calk, bak;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        jari = findViewById(R.id.jari);
        calk = findViewById(R.id.calc);
        hasil = findViewById(R.id.hasil);
        bak = findViewById(R.id.back);

        calk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = 0;
                float jr = Float.parseFloat(jari.getText().toString());
                result  = 3.14 * jr * jr;
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