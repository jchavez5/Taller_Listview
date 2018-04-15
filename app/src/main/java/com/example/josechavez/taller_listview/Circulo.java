package com.example.josechavez.taller_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.PointerIcon;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Circulo extends AppCompatActivity {
    private EditText txtCirculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        txtCirculo=findViewById(R.id.txtCirculo);
    }
    public void calcular(View v){

        double l=Double.parseDouble(txtCirculo.getText().toString());
        double resultado=new Metodos().areaCirculo(l);
        Figura f=new Figura(getString(R.string.area_circulo),getString(R.string.radio)+":"+l,resultado);
        f.guardar();
        Toast.makeText(getApplicationContext(),getString(R.string.resultado)+resultado,Toast.LENGTH_SHORT).show();

    }
    public void borrar(View v){
        txtCirculo.setText("");
    }
}

