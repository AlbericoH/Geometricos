package br.com.geometricos.geometricos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import br.com.geometricos.geometricos.database.Repositorio;

public class Configuracoes extends AppCompatActivity implements View.OnClickListener{

    int verificaSom;

    ImageButton imageButtonSom;
    ImageButton imageButtonReset;
    ImageButton imageButtonVoltar;


    Intent it;
    Repositorio repositorio = new Repositorio(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        verificaSom = repositorio.selectSom();

        imageButtonSom = (ImageButton) findViewById(R.id.imageButtonSom);
        imageButtonSom.setOnClickListener(this);

        imageButtonReset = (ImageButton) findViewById(R.id.imageButtonReset);
        imageButtonReset.setOnClickListener(this);

        imageButtonVoltar = (ImageButton) findViewById(R.id.imageButtonVoltar);
        imageButtonVoltar.setOnClickListener(this);

        if(verificaSom == 0){
            imageButtonSom.setImageResource(R.drawable.nao_som_configuracoes);
        }else if(verificaSom == 1){
            imageButtonSom.setImageResource(R.drawable.som_configuracoes);
        }//fim else
    }//fim onCreate()

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonSom:
                int valor = repositorio.updateSom();
                if(valor == 0){
                    imageButtonSom.setImageResource(R.drawable.nao_som_configuracoes);
                    verificaSom = 0;
                }else if(valor == 1){
                    imageButtonSom.setImageResource(R.drawable.som_configuracoes);
                    verificaSom = 1;
                }//fim else
                break;

            case R.id.imageButtonReset:
                it = new Intent(this, Reset.class);
                startActivity(it);
                finish();
                break;

            case R.id.imageButtonVoltar:
                it = new Intent(this, MainActivity.class);
                startActivity(it);
                finish();
                break;
        }//fim switch
    }//fim onClick()
}
