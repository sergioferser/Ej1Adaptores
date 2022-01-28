package com.example.ej1adaptores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClikBtn(View view) {

        Intent i = new Intent();

        switch (view.getId()) {

            case R.id.btnSpinner:
                i.setClass(this, SpinnerActivity.class);
                startActivity(i);
                break;

            case R.id.btnSpinnerDatos:
                i.setClass(this, SpinnerDatosJava.class);
                startActivity(i);
                break;

            case R.id.btnSpinnerFromResources:
                i.setClass(this, SpinnerFromResourcesActvity.class);
                startActivity(i);
                break;


            case R.id.btnSpinnerDinamicoFake:
                i.setClass(this,SpinnerDinamicoFake.class);
                startActivity(i);
                break;

            case R.id.btnSpinnerDinamicoReal:
                i.setClass(this,SpinnerDinamicoReal.class);
                startActivity(i);
                break;

            case R.id.btnListView:
                i.setClass(this, ListView_activity.class);
                startActivity(i);
                break;

            case R.id.btnListPersonalizada:
                i.setClass(this, ListaPersonalizada.class);
                startActivity(i);
                break;

            case R.id.btnListPersonalizada2:
                i.setClass(this, ListPersonalidaV2.class);
                startActivity(i);
                break;
            case R.id.btnListPersonalizada3:
                i.setClass(this, ListaPersonalizadaV3.class);
                startActivity(i);
            case R.id.btnSalir:
                finish();
                break;
        }


    }
}