package com.example.parouimpar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //imagens
    protected ImageView imgZero;
    protected ImageView imgUm;
    protected ImageView imgDois;
    protected ImageView imgTres;
    protected ImageView imgQuatro;
    protected ImageView imgCinco;
    //select ( Par ou Impar)
    protected RadioButton opPar;
    protected RadioButton opImpar;
    //botao jogar
    protected Button jogar;
    //Variaveis
    protected int temp = 3;
    protected int num = 6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //imagem dos numeros
        imgZero = findViewById(R.id.imgZero);
        imgUm = findViewById(R.id.imgUm);
        imgDois = findViewById(R.id.imgDois);
        imgTres = findViewById(R.id.imgTres);
        imgQuatro = findViewById(R.id.imgQuatro);
        imgCinco = findViewById(R.id.imgCinco);
        // botão
        jogar = findViewById(R.id.jogar);
        //select
        opImpar = findViewById(R.id.selectImpar);
        opPar = findViewById(R.id.selectPar);

        jogar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(temp<3 && num<6) {
                    Intent intent = new Intent(getApplicationContext(), Activity2.class);

                    intent.putExtra("valor", num);
                    intent.putExtra("escolha", temp);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Selecione as opções corretas", Toast.LENGTH_SHORT).show();
                }

            }
        });
        opPar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {temp = 1;}
        });
        opImpar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {temp = 2;}
        });

        imgZero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num = 0;
            }
        });
        imgUm.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num = 1;
            }
        });
        imgDois.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num = 2;
            }
        });
        imgTres.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num = 3;
            }
        });
        imgQuatro.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num = 4;
            }
        });
        imgCinco.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num = 5;
            }
        });

    }

//    public void selecionaZero(View v){
//        imgZero.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.MULTIPLY);
//        this.opcaoSelecionada(0);
//    }
//
//    public void selecionaUm(View v){
//        imgUm.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.MULTIPLY);
//        this.opcaoSelecionada(1);
//
//
//    }
//
//    public void selecionaDois(View v){
//        imgDois.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.MULTIPLY);
//        this.opcaoSelecionada(2);
//
//
//    }
//
//    public void selecionaTres(View v){
//        imgTres.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.MULTIPLY);
//        this.opcaoSelecionada(3);
//
//
//    }
//
//    public void selecionaQuatro(View v){
//        imgQuatro.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.MULTIPLY);
//        this.opcaoSelecionada(4);
//
//
//    }
//
//    public void selecionaCinco(View v){
//        imgCinco.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.MULTIPLY);
//        this.opcaoSelecionada(5);
//
//
//    }
//
//    private void opcaoSelecionada(int opcaoSelecionada) {
//
//        if(opcaoSelecionada == "Zero"){
//            int zero = Integer.parseInt(String.valueOf(imgZero));
//            zero = 0;
//        }
//
//        if(opcaoSelecionada == "Um"){
//            int um = Integer.parseInt(String.valueOf(imgUm));
//            um = 0;
//        }
//
//        if(opcaoSelecionada == "Dois"){
//            int dois = Integer.parseInt(String.valueOf(imgUm));
//            dois = 0;
//        }
//
//        if(opcaoSelecionada == "Tres"){
//            int tres = Integer.parseInt(String.valueOf(imgUm));
//            tres = 0;
//        }
//
//        if(opcaoSelecionada == "Quatro"){
//            int quatro = Integer.parseInt(String.valueOf(imgUm));
//            quatro = 0;
//        }
//
//        if(opcaoSelecionada == "Cinco"){
//            int cinco = Integer.parseInt(String.valueOf(imgUm));
//            cinco = 0;
//        }
//
//    }
}