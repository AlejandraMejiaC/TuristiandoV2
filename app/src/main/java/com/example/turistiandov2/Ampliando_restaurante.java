package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeHotel;
import com.example.turistiandov2.Moldes.MoldeRestaurantes;

public class Ampliando_restaurante extends AppCompatActivity {

    MoldeRestaurantes moldeRestaurantes;
    ImageView fotoAmpliandoRestaurantes;
    TextView nombreAmpliandoRestaurantes;
    TextView precioAmpliandoRestaurantes;
    TextView contactoAmpliandoRestaurantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        fotoAmpliandoRestaurantes=findViewById(R.id.FotoAmpliandoRes);
        nombreAmpliandoRestaurantes=findViewById(R.id.NombreAmpliandoRes);
        precioAmpliandoRestaurantes=findViewById(R.id.precioResAmpliando);
        contactoAmpliandoRestaurantes=findViewById(R.id.telefonoResAmpliando);

        moldeRestaurantes=(MoldeRestaurantes)getIntent().getSerializableExtra("datosrestaurante");
        //cargando la info en los companentes graficos
        fotoAmpliandoRestaurantes.setImageResource(moldeRestaurantes.getFoto());
        nombreAmpliandoRestaurantes.setText(moldeRestaurantes.getNombre());
        precioAmpliandoRestaurantes.setText(moldeRestaurantes.getRangoPrecio());
        contactoAmpliandoRestaurantes.setText(moldeRestaurantes.getTelefono());
    }
}