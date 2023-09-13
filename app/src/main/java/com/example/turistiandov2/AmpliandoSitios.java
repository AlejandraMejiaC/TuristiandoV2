package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeHotel;
import com.example.turistiandov2.Moldes.MoldeSitios;

public class AmpliandoSitios extends AppCompatActivity {

    MoldeSitios moldeSitios;
    ImageView fotoAmpliandoSitios;
    TextView nombreAmpliandoSitios;
    TextView precioAmpliandoSitios;
    TextView contactoAmpliandoSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);
        fotoAmpliandoSitios=findViewById(R.id.FotoAmpliandoSitios);
        nombreAmpliandoSitios=findViewById(R.id.NombreAmpliandoSitios);
        precioAmpliandoSitios=findViewById(R.id.precioSitiosAmpliando);
        contactoAmpliandoSitios=findViewById(R.id.telefonoSitiosAmpliando);
        moldeSitios=(MoldeSitios) getIntent().getSerializableExtra("datossitios");

        //cargando la info en los companentes graficos
        fotoAmpliandoSitios.setImageResource(moldeSitios.getFoto());
        nombreAmpliandoSitios.setText(moldeSitios.getNombre());
        precioAmpliandoSitios.setText(moldeSitios.getPrecio());
        contactoAmpliandoSitios.setText(moldeSitios.getTelefono());
    }
}