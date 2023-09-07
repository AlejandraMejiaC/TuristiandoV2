package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView precioAmpliandoHotel;
    TextView contactoAmpliandoHotel;
    TextView descripcionHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.FotoAmpliandoHotel);
        nombreAmpliandoHotel=findViewById(R.id.NombreAmpliandoHotel);
        precioAmpliandoHotel=findViewById(R.id.precioHotelAmpliando);
        contactoAmpliandoHotel=findViewById(R.id.telefonoHotelAmpliando);
        descripcionHotel=findViewById(R.id.descripcioAmpliandoHotel);
        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        //cargando la info en los companentes graficos
        descripcionHotel.setText(moldeHotel.getDescripcion());
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        precioAmpliandoHotel.setText(moldeHotel.getPrecio());
        contactoAmpliandoHotel.setText(moldeHotel.getTelefono());
    }
}