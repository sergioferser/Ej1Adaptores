package com.example.ej1adaptores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class SpinnerDatosJava extends AppCompatActivity {


    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_datos_java);

        spinner = findViewById(R.id.spPlanetasDatosJava);

        String[] arrayPlanetas = {"Mercurio", "Venus","Terra", "Marte", "Júpiter","Saturno","Urano","Neptuno", "Pluton" };

        // creamos el adaptador(simple)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDatosJava.this, android.R.layout.simple_spinner_item, arrayPlanetas);
        spinner.setAdapter(adapter);




    }
}