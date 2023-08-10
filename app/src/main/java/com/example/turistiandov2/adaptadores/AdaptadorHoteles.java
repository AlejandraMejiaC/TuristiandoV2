package com.example.turistiandov2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.Moldes.MoldeHotel;
import com.example.turistiandov2.R;

import java.util.ArrayList;

public class AdaptadorHoteles extends RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {

    //TODOS ADAPTADORES TIENEN UNA LISTA DE ELEMENTOS
    public ArrayList<MoldeHotel> listaHoteles;

    //CREAMOS UN CONSTRUCCTOR VACIO

    public AdaptadorHoteles() {
    }

    //CREAMOS UN CONSTRUCCTOR LLENO

    public AdaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public AdaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //ESTA PORCION DE CODIGO PERMITE CREAR N COPIAS DEL MOLDE GRAFICO

        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehoteles,null,false);
        return new parent(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
