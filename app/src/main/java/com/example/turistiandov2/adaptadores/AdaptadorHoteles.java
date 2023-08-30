package com.example.turistiandov2.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.AmpliandoHotel;
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
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {
        holder.actualizarDatos(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotoMoldeHotel);
            nombreHotel=itemView.findViewById(R.id.hotelMolde);
            precioHotel=itemView.findViewById(R.id.copMoldeHotel);
            contactoHotel =itemView.findViewById(R.id.numeroContactoMoldeHotel);
        }

        public  void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoHotel.class);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
