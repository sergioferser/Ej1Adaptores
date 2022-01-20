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

        switch(view.getId()){

            case R.id.btnSpinner:
                i.setClass(this, SpinnerActivity.class );

                break;














        }

        startActivity(i);

    }
}