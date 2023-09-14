package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
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
    TextView comentarioAmpliandoSitios;
    TextView descripcionAmpliandoSitios;
    RatingBar valoracionAmpliandoSitios;
    ImageView foto2AmpliandoSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);
        fotoAmpliandoSitios=findViewById(R.id.FotoAmpliandoSitios);
        nombreAmpliandoSitios=findViewById(R.id.NombreAmpliandoSitios);
        precioAmpliandoSitios=findViewById(R.id.precioSitiosAmpliando);
        contactoAmpliandoSitios=findViewById(R.id.telefonoSitiosAmpliando);
        comentarioAmpliandoSitios=findViewById(R.id.textoComentarioSitios);
        descripcionAmpliandoSitios=findViewById(R.id.descripcioAmpliandoSitios);
        valoracionAmpliandoSitios=findViewById(R.id.valoracionSitiosAmpliando);
        foto2AmpliandoSitios=findViewById(R.id.imagen2SitiosAmpliando);

        moldeSitios=(MoldeSitios) getIntent().getSerializableExtra("datossitios");

        //cargando la info en los companentes graficos
        fotoAmpliandoSitios.setImageResource(moldeSitios.getFoto());
        nombreAmpliandoSitios.setText(moldeSitios.getNombre());
        precioAmpliandoSitios.setText(moldeSitios.getPrecio());
        contactoAmpliandoSitios.setText(moldeSitios.getTelefono());
        comentarioAmpliandoSitios.setText(moldeSitios.getComentario());
        descripcionAmpliandoSitios.setText(moldeSitios.getDescripcion());
        valoracionAmpliandoSitios.setRating(moldeSitios.getValoracion());
        foto2AmpliandoSitios.setImageResource(moldeSitios.getFoto2());
    }
}