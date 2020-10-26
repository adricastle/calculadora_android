package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String operator = "";
    Double operando1 = 0.0;
    Double operando2 = 0.0;
    Double res = 0.0;
    Double signo = 0.0;
    Double percent = 0.0;
    boolean concatenado = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tx1 = findViewById(R.id.textView1);
        tx1.setText("0");
        final TextView tx2 = findViewById(R.id.textView2);



        Button boton1 = findViewById(R.id.button1);
        Button boton2 = findViewById(R.id.button2);
        Button boton3 = findViewById(R.id.button3);
        Button boton4 = findViewById(R.id.button4);
        Button boton5 = findViewById(R.id.button5);
        Button boton6 = findViewById(R.id.button6);
        Button boton7 = findViewById(R.id.button7);
        Button boton8 = findViewById(R.id.button8);
        Button boton9 = findViewById(R.id.button9);
        Button boton0 = findViewById(R.id.button0);
        Button boton_multiplicar = findViewById(R.id.button_multiplicar);
        Button boton_sumar = findViewById(R.id.button_sumar);
        Button boton_restar = findViewById(R.id.button_restar);
        Button boton_dividir = findViewById(R.id.button_division);
        Button boton_limpiar = findViewById(R.id.button_c);
        Button boton_igual = findViewById(R.id.button_igual);
        Button boton_punto = findViewById(R.id.button_punto);
        Button boton_cambiosigno = findViewById(R.id.button_signo);
        Button boton_porcentaje = findViewById(R.id.button_porcien);
        Button boton_doblecero = findViewById(R.id.button_doblecero);




        boton1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "1");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "1");
                }
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "2");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "2");
                }
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "3");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "3");
                }
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "4");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "4");
                }
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "5");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "5");
                }
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "6");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "6");
                }
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "7");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "7");
                }
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "8");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "8");
                }

            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("");
                    tx1.setText(tx1.getText().toString() + "9");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "9");
                }
            }
        });

        boton_doblecero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("0");

                }
                else{
                    tx1.setText(tx1.getText().toString() + "00");
                }

            }
        });

        boton0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(((tx1.getText().toString()) == ("0")) || (concatenado==true)){
                    tx1.setText("0");
                }
                else{
                    tx1.setText(tx1.getText().toString() + "0");
                }

            }
        });

        boton_sumar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(concatenado == false){
                    operator = "+";
                    tx2.setText(tx2.getText().toString() + tx1.getText().toString() + "+");
                    operando1 = Double.parseDouble(tx1.getText().toString());
                    tx1.setText("");

                    concatenado=true;
                }
                else{


                    tx2.setText(tx2.getText().toString() + tx1.getText().toString() + "+");

                    operando2 = Double.parseDouble(tx1.getText().toString());

                    res = operando1 + operando2;
                    tx1.setText(String.valueOf(res));
                    operando1 = res;
                    concatenado=true;
                    operator = "+";
                }
            }
        });
        boton_restar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(concatenado == false){
                    operator = "-";
                    tx2.setText(tx2.getText().toString() + tx1.getText().toString() + "-");
                    operando1 = Double.parseDouble(tx1.getText().toString());
                    tx1.setText("");

                    concatenado=true;
                }
                else{

                    tx2.setText(tx2.getText().toString() + tx1.getText().toString() + "-");

                    operando2 = Double.parseDouble(tx1.getText().toString());

                    res = operando1 - operando2;

                    tx1.setText(String.valueOf(res));
                    operando1 = res;
                    concatenado=true;
                    operator = "-";
                }
            }
        });
        boton_dividir.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                operator = "/";
                tx2.setText(tx2.getText().toString() + tx1.getText().toString() + "/");
                operando1 += Double.parseDouble(tx1.getText().toString());
                tx1.setText("");
            }
        });
        boton_multiplicar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                operator = "*";
                tx2.setText(tx2.getText().toString() + tx1.getText().toString() + "*");
                operando1 += Double.parseDouble(tx1.getText().toString());
                tx1.setText("");
            }
        });
        boton_limpiar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tx1.setText("0");
                tx2.setText("");
                operando1 = 0.0;
                operando2 = 0.0;
                concatenado=false;
            }
        });

        boton_punto.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(("0") == (tx1.getText().toString())) {
                    tx1.setText("0.");
                }
                else{
                    tx1.setText(tx1.getText().toString() + ".");
                }
            }
        });

        boton_cambiosigno.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                signo = Double.parseDouble(tx1.getText().toString());
                signo = signo - (signo * 2);
                tx1.setText(signo.toString());
            }
        });

        boton_porcentaje.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                percent = operando1 * (Double.parseDouble(tx1.getText().toString())) / 100;
                tx1.setText(percent.toString());
                tx2.setText(tx2.getText().toString() + tx1.getText().toString());

            }
        });



        boton_igual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tx2.setText(tx2.getText().toString() + tx1.getText().toString());
                operando2 = Double.parseDouble(tx1.getText().toString());
                if(operator.equals("+")){
                    tx1.setText("");
                    res = operando1 + operando2;
                }
                if(operator.equals("-")){
                    tx1.setText("");
                    res = operando1 - operando2;
                }
                if(operator.equals("*")){
                    tx1.setText("");
                    res = operando1 * operando2;
                }
                if(operator.equals("/")){
                    tx1.setText("");
                    if(operando2==0){
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, "error", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    res = operando1 / operando2;

                }

                tx1.setText(String.valueOf(res));
                tx2.setText("");
                concatenado=true;


            }
        });


    }



}