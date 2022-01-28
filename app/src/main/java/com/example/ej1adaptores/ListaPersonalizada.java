package com.example.ej1adaptores;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListaPersonalizada extends AppCompatActivity {

    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada);

        listView = findViewById(R.id.lvPersonalizada);

        //adaptador personalizado para el array con la imagen única
        ArrayAdapter<String> adapterPersonalizado = new ArrayAdapter<String>(ListaPersonalizada.this,
                R.layout.fila_simple, R.id.tvPlaneta,  getResources().getStringArray(R.array.planetas));



        listView.setAdapter(adapterPersonalizado);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListaPersonalizada.this, listView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();

            }
        }) ;
    }


}