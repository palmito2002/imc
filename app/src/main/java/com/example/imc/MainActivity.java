package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText txtpeso, txtaltura;

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        txtaltura = (EditText) findViewById(R.id.txtaltura);
        txtpeso = (EditText) findViewById(R.id.txtpeso);
    }


    public void calcular(View view) {
        float peso = 0;
        float altura = 0;
        float imc = 0;

        peso = Float.parseFloat(txtpeso.getText().toString());
        altura = Float.parseFloat(txtaltura.getText().toString());
        imc = peso / (altura * altura);
        if (imc <= 18.5) {
            imageView.setImageResource(R.drawable.abaixopeso);
        } else if ((imc >= 18.6) && (imc <= 24.9)) {
            imageView.setImageResource(R.drawable.normal);
        } else if ((imc >= 25.0) && (imc <= 29.9)) {
            imageView.setImageResource(R.drawable.sobrepeso);
        } else if ((imc >= 30.0) && (imc <= 34.9)) {
            imageView.setImageResource(R.drawable.obesidade1);
        } else if ((imc >= 35.0) && (imc <= 39.9)) {
            imageView.setImageResource(R.drawable.obesidade2);
        } else if (imc >= 40.0) {
            imageView.setImageResource(R.drawable.obesidade3);
        }
    }
}



