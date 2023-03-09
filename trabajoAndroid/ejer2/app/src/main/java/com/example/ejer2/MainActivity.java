package com.example.ejer2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText salarioMensual, ingresosExt, gastosMens;
    TextView respuesta;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        salarioMensual = findViewById(R.id.salarioMensual);
        ingresosExt = findViewById(R.id.ingresosExt);
        gastosMens = findViewById(R.id.gastosMens);
        respuesta = findViewById(R.id.respuesta);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float salario = Float.parseFloat(salarioMensual.getText().toString());
                float ingresos = Float.parseFloat(ingresosExt.getText().toString());
                float gastos = Float.parseFloat(gastosMens.getText().toString());
                float ahorro = (salario + ingresos) - gastos;

                String r = String.valueOf(ahorro);
                respuesta.setText(ahorro + "$");
            }
        });
    }
}