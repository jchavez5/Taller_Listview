package com.example.josechavez.taller_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cono extends AppCompatActivity {
    private EditText txtRadio,txtAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
    }
    public void calcular(View v){

        double R=Double.parseDouble(txtRadio.getText().toString());
        double A=Double.parseDouble(txtAltura.getText().toString());
        double resultado=new Metodos().volumen_cono(R,A);
        Figura f=new Figura(getResources().getString(com.example.josechavez.taller_listview.R.string.area_circulo),getResources().getString(com.example.josechavez.taller_listview.R.string.radio)+R
                +"\n"+getResources().getString(com.example.josechavez.taller_listview.R.string.altura)+A,resultado);
        f.guardar();
        Toast.makeText(getApplicationContext(),getResources().getString(com.example.josechavez.taller_listview.R.string.resultado)+""+resultado,Toast.LENGTH_SHORT).show();

    }
    public void borrar(View v){
        txtRadio.setText("");
        txtAltura.setText("");}
}