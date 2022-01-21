package com.example.ej1adaptores;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SpinnerDinamicoReal extends AppCompatActivity {


    private Spinner spinner;
    private EditText etAdd;
    private Button btnAdd;
    private Button btnRemove;
    private ArrayList<String> arrayListPlanetas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_dinamico_real);
        spinner= findViewById(R.id.spPlanetas);
        btnAdd= findViewById(R.id.btnAdd);
        etAdd= findViewById(R.id.etAdd);
        btnRemove= findViewById(R.id.btnRemove);

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
                Toast.makeText(SpinnerDinamicoReal.this, "El planeta es "+planeta + "\n Está seleccionado "+ planeta2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etAdd.getText().toString().equals("")){
                    Toast.makeText(SpinnerDinamicoReal.this, "Campo vacío", Toast.LENGTH_SHORT).show();
                }else{
                    arrayListPlanetas.add(etAdd.getText().toString());
                    etAdd.setText("");
                }
            }
        });
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=spinner.getSelectedItemPosition();
                arrayListPlanetas.remove(r);
                adaptador.notifyDataSetChanged();
            }
        });
    }

}

