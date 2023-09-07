package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.Moldes.MoldeHotel;
import com.example.turistiandov2.adaptadores.AdaptadorHoteles;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList <MoldeHotel> listadehoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listadehoteles);
        recyclerView.setAdapter(adaptadorHoteles);
        }

        public  void llenarListaConDatos (){
            listadehoteles.add(new MoldeHotel("Hostal Cano Nevera","$140.000","314 4626899",R.drawable.canonevera,"hotel hermoso y agradable"));
            listadehoteles.add(new MoldeHotel("La Manigua Lodge","$622.000"," 314 7569808",R.drawable.manigua,"hotel hermoso y agradable"));
            listadehoteles.add(new MoldeHotel("Hotel La Fuente","$180.000","313 4967701",R.drawable.hotellafuente,"hotel hermoso y agradable"));
            listadehoteles.add(new MoldeHotel("Posada Los Cristales","$65.000","322 4228084",R.drawable.hotelposadacristales,"hotel hermoso y agradable"));
            listadehoteles.add(new MoldeHotel("Hotel Ecologico Makalombia","$287.000"," 311 3741990",R.drawable.makalombia,"hotel hermoso y agradable"));
        }
}