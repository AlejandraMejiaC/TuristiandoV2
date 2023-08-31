package com.example.turistiandov2.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.AmpliandoSitios;
import com.example.turistiandov2.Ampliando_restaurante;
import com.example.turistiandov2.Moldes.MoldeRestaurantes;
import com.example.turistiandov2.R;

import java.util.ArrayList;

public class AdaptadorRestaurante extends RecyclerView.Adapter<AdaptadorRestaurante.viewHolder> {

    public ArrayList<MoldeRestaurantes> listaRestaurantes;

    public AdaptadorRestaurante() {
    }

    public AdaptadorRestaurante(ArrayList<MoldeRestaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurantes,null,false);
        return  new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView platoRecomendado;
        TextView precioRestaurante;
        TextView contactoRestaurante;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante = itemView.findViewById(R.id.fotoMoldeRes);
            nombreRestaurante = itemView.findViewById(R.id.restauranteMolde) ;
            precioRestaurante = itemView.findViewById(R.id.copMoldeRes);
            contactoRestaurante = itemView.findViewById(R.id.numeroContactoMoldeRes);
            platoRecomendado = itemView.findViewById(R.id.platoRecomendado);

        }

        public void actualizarDatos(MoldeRestaurantes moldeRestaurantes) {
            fotoRestaurante.setImageResource(moldeRestaurantes.getFoto());
            nombreRestaurante.setText(moldeRestaurantes.getNombre());
            precioRestaurante.setText(moldeRestaurantes.getRangoPrecio());
            platoRecomendado.setText(moldeRestaurantes.getPlatoRecomendado());
            contactoRestaurante.setText(moldeRestaurantes.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Ampliando_restaurante.class);
                    intent.putExtra("datoshotel",moldeRestaurantes);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
