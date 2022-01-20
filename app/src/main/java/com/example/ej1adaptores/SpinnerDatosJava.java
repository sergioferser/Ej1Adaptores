package com.example.ej1adaptores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class SpinnerDatosJava extends AppCompatActivity {


    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_datos_java);

        spinner = findViewById(R.id.spPlanetasDatosJava);

        String[] arrayPlanetas = {"Mercurio", "Venus","Tierra", "Marte", "Júpiter","Saturno","Urano","Neptuno", "Pluton" };

        // creamos el adaptador(simple)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDatosJava.this, android.R.layout.simple_spinner_dropdown_item, arrayPlanetas);
       //asignanos el adaptador a la vista spinner en donde se mostrará
        //dichos datos
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //obtener el elemnto seleccionado
                String seleccion1 = spinner.getSelectedItem().toString();
                //otra forma de obtener el item seleccionado
                String seleccion2 = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(SpinnerDatosJava.this,"Estamos en "+ spinner.getSelectedItem().toString()+ "\nseleccion "+ seleccion2,Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }
}