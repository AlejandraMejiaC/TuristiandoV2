package com.example.turistiandov2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.Moldes.MoldeRestaurantes;
import com.example.turistiandov2.Moldes.MoldeSitios;
import com.example.turistiandov2.R;

import java.util.ArrayList;

public class AdaptadorSitios extends RecyclerView.Adapter<AdaptadorSitios.viewHolder>{

    public ArrayList<MoldeSitios> listaSitios;

    public AdaptadorSitios() {
    }

    public AdaptadorSitios(ArrayList<MoldeSitios> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public AdaptadorSitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null,false);
        return  new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorSitios.viewHolder holder, int position) {
        holder.actualizarDatos(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoSitios;
        TextView nombreSitio;
        TextView nombreGuia;
        TextView contactoGuia;
        TextView precioSitio;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
             nombreGuia = itemView.findViewById(R.id.nombreGuiaMoldeSitios);
             fotoSitios = itemView.findViewById(R.id.fotoMoldeSitios);
             nombreSitio = itemView.findViewById(R.id.lugarTuristico);
             contactoGuia = itemView.findViewById(R.id.numeroContactoMoldeSitios);
             precioSitio = itemView.findViewById(R.id.precioMoldeSitios);
        }

        public void actualizarDatos(MoldeSitios moldeSitios) {
            fotoSitios.setImageResource(moldeSitios.getFoto());
            nombreSitio.setText(moldeSitios.getNombre());
            precioSitio.setText(moldeSitios.getPrecio());
            nombreGuia.setText(moldeSitios.getNombreGuia());
            contactoGuia.setText(moldeSitios.getTelefono());
        }


    }
}
