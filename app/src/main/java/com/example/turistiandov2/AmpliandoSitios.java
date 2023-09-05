package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeHotel;
import com.example.turistiandov2.Moldes.MoldeSitios;

public class AmpliandoSitios extends AppCompatActivity {

    MoldeSitios moldeSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);

        moldeSitios=(MoldeSitios) getIntent().getSerializableExtra("datossitios");
        Toast.makeText(this, moldeSitios.getNombre(), Toast.LENGTH_LONG).show();
    }
}