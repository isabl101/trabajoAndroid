package com.example.salario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText horasTrab, valorHora, tiempo, deduccion;
    public Button calcular;
    public TextView totalBruto, totalNeto, totalBon, totalDed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        horasTrab = findViewById(R.id.horasTrab);
        valorHora = findViewById(R.id.valorHora);
        tiempo = findViewById(R.id.tiempo);
        deduccion = findViewById(R.id.deduccion);
        calcular = findViewById(R.id.calcular);
        totalBruto = findViewById(R.id.totalBruto);
        totalNeto = findViewById(R.id.totalNeto);
        totalBon = findViewById(R.id.totalBon);
        totalDed = findViewById(R.id.totalDed);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int horasTrab_v, tiempo_v,valorHora_v, deduccion_v,totalBruto_v, totalNeto_v, totalBon_v, totalDed_v;

                valorHora_v = Integer.parseInt(valorHora.getText().toString());
                deduccion_v = Integer.parseInt(deduccion.getText().toString());
                totalBruto_v = Integer.parseInt(totalBruto.getText().toString());
                totalBon_v = Integer.parseInt(totalBon.getText().toString());
                totalDed_v = Integer.parseInt(totalDed.getText().toString());

                horasTrab_v = Integer.parseInt(horasTrab.getText().toString());
                tiempo_v = Integer.parseInt(tiempo.getText().toString());

                totalBruto.setText(valorHora_v * horasTrab_v);
                totalBon.setText((30000 * tiempo_v) / 12);
                totalDed.setText(deduccion_v * tiempo_v);
                totalNeto.setText(totalBruto_v + totalBon_v - totalDed_v);
            }
        });

    }
}