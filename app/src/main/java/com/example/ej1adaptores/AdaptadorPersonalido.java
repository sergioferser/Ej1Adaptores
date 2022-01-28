package com.example.ej1adaptores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class AdaptadorPersonalido extends ArrayAdapter {

    private  Activity contexto;
    private  String[] arrayPlanetas;
    private  int[]   arrayIdFotos;




    public AdaptadorPersonalido(@NonNull Activity context,
                                int layoutPersonalizado,
                                String[] arrayPlanetas,
                                int[] arrayIdFotos) {
        super(context, layoutPersonalizado, arrayPlanetas);

        this.contexto = context;
        this.arrayPlanetas = arrayPlanetas;
        this.arrayIdFotos = arrayIdFotos;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        //creamos un objeto inflador para convetir nuestro layout de fila en un objeto
        // java que se puede modificar
        LayoutInflater layoutInflater= contexto.getLayoutInflater();
        // mediante el objeto con el metofo inflate creamos el objeto java
        // oara rellenarlo con los datos
        View fila = layoutInflater.inflate(R.layout.fila_con_imagen_diferente,null);
        TextView tvPlanete = fila.findViewById(R.id.tvPlaneta);
        ImageView imgPlaneta = fila.findViewById(R.id.imgPlaneta);
        tvPlanete.setText(arrayPlanetas[position]);
        imgPlaneta.setImageResource(arrayIdFotos[position]);
        return fila;
    }
}
