package com.example.ej1adaptores;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SpinnerDinamicoFake extends AppCompatActivity {


    private Spinner spinner;
    private ArrayList<String> arrayListPlanetas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_dinamico_fake);
        spinner= findViewById(R.id.spPlanetas);
//        Simulacro!!! Añadimos elementos al array de forma dinamica
        arrayListPlanetas= new ArrayList<String>();
        arrayListPlanetas.add("Mercurio");
        arrayListPlanetas.add("Venus");
        arrayListPlanetas.add("Tierra");
        arrayListPlanetas.add("Marte");
        arrayListPlanetas.add("Jupiter");
        arrayListPlanetas.add("Saturno");
        arrayListPlanetas.add("Urano");
        arrayListPlanetas.add("Neptuno");
//   Creacion del adaptador
        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, arrayListPlanetas);

//        Asignar adaptador
        spinner.setAdapter(adaptador);

//        Listener del spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String planeta= spinner.getSelectedItem().toString();
                String planeta2= spinner.getItemAtPosition(i).toString();
                Toast.makeText(SpinnerDinamicoFake.this, "El planeta es "+planeta + "\n Está seleccionado "+ planeta2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
