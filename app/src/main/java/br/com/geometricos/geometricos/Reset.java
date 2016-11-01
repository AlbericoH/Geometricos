package br.com.geometricos.geometricos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

import br.com.geometricos.geometricos.database.Repositorio;

public class Reset extends AppCompatActivity implements View.OnClickListener{

    ImageButton button1;
    ImageButton button2;

    Repositorio repositorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        button1 = (ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        repositorio = new Repositorio(this);
    }//fim onCreate

    @Override
    public void onClick(View view) {

        Intent it;

        switch (view.getId()){
            case R.id.button1:
                repositorio.reset();
                it = new Intent(this, JogosActivity.class);
                startActivity(it);
                finish();
                break;

            case R.id.button2:
                it = new Intent(this, Configuracoes.class);
                startActivity(it);
                finish();
                break;
        }//fim switch
    }//fim onClick()

}//fim class
