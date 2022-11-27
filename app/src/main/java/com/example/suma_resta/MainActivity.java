package com.example.suma_resta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valor1, valor2;
    TextView res;
    Button suma, resta, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.et_1);
        valor2 = (EditText) findViewById(R.id.et_2);
        res = (TextView) findViewById(R.id.resultado);
        suma = (Button) findViewById(R.id.button);
        resta = (Button) findViewById(R.id.button2);
        salir= (Button)findViewById(R.id.salir);
    }
        public void suma(View view){
            double x, y;
            double r;
            x=Integer.parseInt(valor1.getText().toString());
            y=Integer.parseInt(valor2.getText().toString());
            r=x + y;
            res.setText(String.valueOf(r));
        }

        public  void resta(View view){
            double x, y;
            double r;
            x=Integer.parseInt(valor1.getText().toString());
            y=Integer.parseInt(valor2.getText().toString());
            r=x - y;
            res.setText(String.valueOf(r));
        }

        public void salir(View view){
        finish();
        }


}