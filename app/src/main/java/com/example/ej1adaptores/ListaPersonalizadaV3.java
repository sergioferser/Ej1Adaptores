package com.example.ej1adaptores;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListaPersonalizadaV3 extends AppCompatActivity {
    private ListView listView;
    private String[] planetas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada_v3);

        listView = findViewById(R.id.lvPersonalizadaV3);
        planetas = getResources().getStringArray(R.array.planetas);
        int[] arrayIdFotos = {
                R.drawable.mercurio,
                R.drawable.venus,
                R.drawable.tierra,
                R.drawable.marte,
                R.drawable.jupiter,
                R.drawable.saturno,
                R.drawable.urano,
                R.drawable.neptuno,
        };




        //crear una instancia de nuestro adapatador personalizado
        AdaptadorPersonalido_2 adaptadorPersonalido = new AdaptadorPersonalido_2(this,
                R.layout.fila_simplev3, planetas,arrayIdFotos );

        listView.setAdapter(adaptadorPersonalido);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListaPersonalizadaV3.this, listView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}