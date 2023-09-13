package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    ImageView fotoAmplianodHotel2;
    TextView nombreAmpliandoHotel;
    TextView precioAmpliandoHotel;
    TextView contactoAmpliandoHotel;
    RatingBar valoracion;
    TextView comentario;
    TextView descripcionHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.FotoAmpliandoHotel);
        fotoAmplianodHotel2=findViewById(R.id.imagen2HotelAmpliando);
        nombreAmpliandoHotel=findViewById(R.id.NombreAmpliandoHotel);
        precioAmpliandoHotel=findViewById(R.id.precioHotelAmpliando);
        contactoAmpliandoHotel=findViewById(R.id.telefonoHotelAmpliando);
        valoracion=findViewById(R.id.valoracionHotelAmpliando);
        comentario=findViewById(R.id.textoComentario);
        descripcionHotel=findViewById(R.id.descripcioAmpliandoHotel);
        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        //cargando la info en los companentes graficos
        descripcionHotel.setText(moldeHotel.getDescripcion());
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        fotoAmplianodHotel2.setImageResource(moldeHotel.getFoto2());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        precioAmpliandoHotel.setText(moldeHotel.getPrecio());
        contactoAmpliandoHotel.setText(moldeHotel.getTelefono());
        valoracion.setRating(moldeHotel.getValoracion());
        comentario.setText(moldeHotel.getComentario());
        descripcionHotel.setText(moldeHotel.getDescripcion());
    }
}