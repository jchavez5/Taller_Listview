package com.example.josechavez.taller_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cubo extends AppCompatActivity {
    private EditText txtArista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        txtArista=findViewById(R.id.txtCubo);
    }
    public void calcular(View v){
        if ((Metodos.valida(txtArista,getResources().getString(R.string.error),
                getResources().getString(R.string.error_1)))){
            double l=Double.parseDouble(txtArista.getText().toString());
            double resultado=new Metodos().volumen_cubo(l);
            Figura f=new Figura(getResources().getString(com.example.josechavez.taller_listview.R.string.area_cubo),
                    getResources().getString(com.example.josechavez.taller_listview.R.string.arista)+":"+l,resultado);
            f.guardar();
            Toast.makeText(getApplicationContext(),getString(R.string.resultado)+resultado,Toast.LENGTH_SHORT).show();
        }
    }
    public void borrar(View v){
        txtArista.setText("");
    }
}
