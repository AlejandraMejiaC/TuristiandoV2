package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeHotel;
import com.example.turistiandov2.Moldes.MoldeRestaurantes;

public class Ampliando_restaurante extends AppCompatActivity {

    MoldeRestaurantes moldeRestaurantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        moldeRestaurantes=(MoldeRestaurantes)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, moldeRestaurantes.getNombre(), Toast.LENGTH_LONG).show();
    }
}