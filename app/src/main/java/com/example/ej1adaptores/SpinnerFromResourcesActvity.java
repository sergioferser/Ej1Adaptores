package com.example.ej1adaptores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerFromResourcesActvity extends AppCompatActivity {


    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_from_resources_actvity);

        spinner= findViewById(R.id.spPlanetas);

        //recuperar los datos desde el string-array mediante un método nuevo

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planetas,
                android.R.layout.simple_spinner_dropdown_item);

        // asignar el adaptador a la vista
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //obtener el elemnto seleccionado
                String seleccion1 = spinner.getSelectedItem().toString();
                //otra forma de obtener el item seleccionado
                String seleccion2 = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(SpinnerFromResourcesActvity.this,"Estamos en "
                        + spinner.getSelectedItem().toString()+ "\nseleccion "+ seleccion2,Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });











    }
}