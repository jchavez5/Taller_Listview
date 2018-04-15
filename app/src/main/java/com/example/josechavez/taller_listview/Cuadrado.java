package com.example.josechavez.taller_listview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Cuadrado extends AppCompatActivity {
    private EditText txtLadoCuadrado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        txtLadoCuadrado=findViewById(R.id.txtLadoCuadrado);

         }
        public void calcular(View  v){

                double l=Double.parseDouble(txtLadoCuadrado.getText().toString());
                double resultado=new Metodos().areaCuadrado(l);
                Figura f=new Figura(getString(R.string.area_cuadrado),getString(R.string.dato)+l,resultado);
                f.guardar();
                Toast.makeText(getApplicationContext(),getString(R.string.resultado)+resultado,Toast.LENGTH_SHORT).show();

        }
        public void borrar(View v){
            txtLadoCuadrado.setText("");
        }
        }



