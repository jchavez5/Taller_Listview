package com.example.josechavez.taller_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Triangulo extends AppCompatActivity {
    private EditText txtBase,txtAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        txtBase= findViewById(R.id.txtxBase);
        txtAltura=findViewById(R.id.txtAltura);
    }
    public void calcular(View v){
        if ((Metodos.valida(txtBase,getResources().getString(R.string.error),
                getResources().getString(R.string.error_1)))&&(Metodos.valida(txtAltura,getResources().getString(R.string.error),
                getResources().getString(R.string.error_1)))){
            double b=Double.parseDouble(txtBase.getText().toString());
            double a=Double.parseDouble(txtAltura.getText().toString());
            double resultado=new Metodos().areaTriangulo(b,a);
            Figura f=new Figura(getResources().getString(com.example.josechavez.taller_listview.R.string.area_triangulo),
                    getResources().getString(com.example.josechavez.taller_listview.R.string.base1)+b+"\n"+
                            getResources().getString(com.example.josechavez.taller_listview.R.string.altura1)+a,resultado);
            f.guardar();
            Toast.makeText(getApplicationContext(),getString(R.string.resultado)+resultado,Toast.LENGTH_SHORT).show();
        }
    }
    public void borrar(View v){
        txtAltura.setText("");
        txtBase.setText("");}
}


