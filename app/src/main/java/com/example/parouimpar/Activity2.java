package com.example.parouimpar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Activity2 extends AppCompatActivity {

    //Imagens
    protected ImageView imgAndroid;
    protected ImageView imgMinha;
    //Label Resposta
    protected TextView txtResult;
    //bo
    protected Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int temp;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        imgAndroid = findViewById(R.id.imgAndroid);
        imgMinha = findViewById(R.id.imgMinha);
        txtResult = findViewById(R.id.txtResultado);
        voltar = findViewById(R.id.voltar);
        Bundle dados = getIntent().getExtras();
        int resp = dados.getInt("valor");
        int escolha = dados.getInt("escolha");
        Random gerador = new Random();
        temp = gerador.nextInt(6);



        int result = temp + resp;
        //validar vitoria
        switch (escolha){
            case 1:
                if(result % 2 == 0){
                    txtResult.setText("VITORIA");
                }else{
                    txtResult.setText("PERDEU");
                }
                break;
            case 2:
                if(result % 2 != 0){
                    txtResult.setText("VITORIA");
                }else{
                    txtResult.setText("PERDEU");
                }
                break;
            default:
                Toast.makeText(this, "Deu merda", Toast.LENGTH_SHORT).show();
                break;

        }
        //mudar imagem
        switch (resp){
            case 0:
                imgMinha.setImageResource(R.drawable.f0);
                break;
            case 1:
                imgMinha.setImageResource(R.drawable.f1);
                break;
            case 2:
                imgMinha.setImageResource(R.drawable.f2);
                break;
            case 3:
                imgMinha.setImageResource(R.drawable.f3);
                break;
            case 4:
                imgMinha.setImageResource(R.drawable.f4);
                break;
            case 5:
                imgMinha.setImageResource(R.drawable.f5);
                break;
            default:
                Toast.makeText(this, "Deu Merda", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (temp){
            case 0:
                imgAndroid.setImageResource(R.drawable.f0);
                break;
            case 1:
                imgAndroid.setImageResource(R.drawable.f1);
                break;
            case 2:
                imgAndroid.setImageResource(R.drawable.f2);
                break;
            case 3:
                imgAndroid.setImageResource(R.drawable.f3);
                break;
            case 4:
                imgAndroid.setImageResource(R.drawable.f4);
                break;
            case 5:
                imgAndroid.setImageResource(R.drawable.f5);
                break;
            default:
                Toast.makeText(this, "Deu Merda", Toast.LENGTH_SHORT).show();
                break;
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });





    }
}