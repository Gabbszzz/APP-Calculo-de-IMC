package com.example.imc;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v) {

        TextView lblResultado = (TextView) findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if (resultado < 18.5) {
            //abaixo
            lblResultado.setText("Abaixo do peso!");
        } else if (resultado <= 24.9) {
            //ideal
            lblResultado.setText("Peso ideal!");
        } else if (resultado <= 34.9) {
            //levemente acima
            lblResultado.setText("Levemente acima do peso!");
        } else if (resultado <= 34.9) {
            //Obesidade 1
            lblResultado.setText("Obesidade grau I");
        } else if (resultado <= 39.9) {
            //Obesidade 2
            lblResultado.setText("Obesidade grau II (severa)");
        } else if
            //Obesidade 3
            (resultado > 40) {
                lblResultado.setText("Obesidade III (mórbida)");
            }
        }
    }
