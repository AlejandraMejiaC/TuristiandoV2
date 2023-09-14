package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
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
    TextView comentarioAmpliandoRestaurantes;
    TextView descripcionAmpliandoRestaurante;
    RatingBar valoracionAmpliandoRestaurante;
    ImageView foto2AmpliandoRestaurante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        fotoAmpliandoRestaurantes=findViewById(R.id.FotoAmpliandoRes);
        nombreAmpliandoRestaurantes=findViewById(R.id.NombreAmpliandoRes);
        precioAmpliandoRestaurantes=findViewById(R.id.precioResAmpliando);
        contactoAmpliandoRestaurantes=findViewById(R.id.telefonoResAmpliando);
        comentarioAmpliandoRestaurantes=findViewById(R.id.textoComentarioRes);
        descripcionAmpliandoRestaurante=findViewById(R.id.descripcioAmpliandoRes);
        valoracionAmpliandoRestaurante=findViewById(R.id.valoracionAmpliandoRes);
        foto2AmpliandoRestaurante=findViewById(R.id.imagen2AmpliandoRes);

        moldeRestaurantes=(MoldeRestaurantes)getIntent().getSerializableExtra("datosrestaurante");
        //cargando la info en los companentes graficos
        fotoAmpliandoRestaurantes.setImageResource(moldeRestaurantes.getFoto());
        nombreAmpliandoRestaurantes.setText(moldeRestaurantes.getNombre());
        precioAmpliandoRestaurantes.setText(moldeRestaurantes.getRangoPrecio());
        contactoAmpliandoRestaurantes.setText(moldeRestaurantes.getTelefono());
        comentarioAmpliandoRestaurantes.setText(moldeRestaurantes.getComentario());
        descripcionAmpliandoRestaurante.setText(moldeRestaurantes.getDescripcion());
        valoracionAmpliandoRestaurante.setRating(moldeRestaurantes.getValoracion());
        foto2AmpliandoRestaurante.setImageResource(moldeRestaurantes.getFoto2());
    }
}