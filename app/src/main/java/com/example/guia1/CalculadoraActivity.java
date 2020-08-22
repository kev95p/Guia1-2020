package com.example.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtEntrada;
    TextView txtSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Button btn0  = findViewById(R.id.btn0);
        Button btn1  = findViewById(R.id.btn1);
        Button btn2  = findViewById(R.id.btn2);
        Button btn3  = findViewById(R.id.btn3) ;
        Button btn4  = findViewById(R.id.btn4);
        Button btn5  = findViewById(R.id.btn5);
        Button btn6  = findViewById(R.id.btn6);
        Button btn7  = findViewById(R.id.btn7);
        Button btn8  = findViewById(R.id.btn8);
        Button btn9  = findViewById(R.id.btn9);
        Button btnAc  = findViewById(R.id.btnAC);
        Button btnDel = findViewById(R.id.btnDEL);
        Button btnIgual = findViewById(R.id.btnIgual);
        Button btnMas  = findViewById(R.id.btnMas);
        Button btnMenos  = findViewById(R.id.btnMenos);
        Button btnMult  = findViewById(R.id.btnMult);
        Button btnDiv = findViewById(R.id.btnDiv);

        txtEntrada = findViewById(R.id.txtEntrada);
        txtSalida = findViewById(R.id.txtSalida);




        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnDiv.setOnClickListener(this);
        btnMas.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnAc.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnIgual.setOnClickListener(this);




    }

    @Override
        public void onClick(View view) {
            StringBuilder entrada = new StringBuilder();
            entrada.append(txtEntrada.getText().toString());

            switch (view.getId()){
                case R.id.btn0:
                    entrada.append(0);
                    break;
                case R.id.btn9:
                    entrada.append(9);
                    break;
                case R.id.btn1:
                    entrada.append(1);
                    break;
                case R.id.btn2:
                    entrada.append(2);
                    break;
                case R.id.btn3:
                    entrada.append(3);
                    break;
                case R.id.btn4:
                    entrada.append(4);
                    break;
                case R.id.btn5:
                    entrada.append(5);
                    break;
                case R.id.btn6:
                    entrada.append(6);
                    break;
                case R.id.btn7:
                    entrada.append(7);
                    break;
                case R.id.btn8:
                    entrada.append(8);
                    break;
                case R.id.btnMas:
                    entrada.append("+");
                    break;
                case R.id.btnMenos:
                    entrada.append("-");
                    break;
                case R.id.btnMult:
                    entrada.append("*");
                    break;
                case R.id.btnDiv:
                    entrada.append("/");
                    break;
                case R.id.btnDEL:
                    if(entrada.length() > 0 ) {
                        entrada.deleteCharAt(entrada.length() - 1);
                    }
                    break;
                case R.id.btnAC:
                        entrada.delete(0,entrada.length());
                        txtSalida.setText("");
                    break;
                case R.id.btnIgual:
                    Expression e = new ExpressionBuilder(entrada.toString()).build();
                    txtSalida.setText(String.valueOf(e.evaluate()));
                    break;
            }
            txtEntrada.setText(entrada.toString());
        }
}