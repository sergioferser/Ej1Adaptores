package com.example.ej1adaptores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.spPlanetas);





        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //obtener el elemnto seleccionado
                String seleccion1 = spinner.getSelectedItem().toString();
                //otra forma de obtener el item seleccionado
                String seleccion2 = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(SpinnerActivity.this,"Estamos en "+ spinner.getSelectedItem().toString()+ "\nseleccion "+ seleccion2,Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }







}