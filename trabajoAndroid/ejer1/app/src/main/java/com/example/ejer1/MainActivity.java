package com.example.ejer1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btnCalcular;
    public EditText msj_altura;
    public EditText msj_base;
    public TextView msj_respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        msj_altura = findViewById(R.id.msj_altura);
        msj_base = findViewById(R.id.msj_base);
        msj_respuesta = findViewById(R.id.msj_respuesta);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double base = Double.parseDouble(msj_base.getText().toString());
                double altura = Double.parseDouble(msj_altura.getText().toString());
                double area = base * altura /2;

                String r = String.valueOf(area);

                msj_respuesta.setText("El area del triangulo es: " + area);
            }
        });
    }
}