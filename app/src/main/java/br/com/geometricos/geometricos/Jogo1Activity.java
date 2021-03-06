package br.com.geometricos.geometricos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import android.graphics.PorterDuff;
import java.util.ArrayList;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import br.com.geometricos.geometricos.database.Repositorio;

public class Jogo1Activity extends AppCompatActivity implements View.OnClickListener{

    Intent it;

    ImageButton imageButtonVoltar;
    ImageButton imageButtonSom;
    ImageButton imageButtonMostrarSoma;

    int NUM_JOGO = 1;
    int PROXIMO_JOGO = NUM_JOGO + 1;

    int a=1, b=1, c=1, d=1;
    int confere1, confere2;
    int total;

    Spinner spinnerA, spinnerB, spinnerC, spinnerD;
    TextView textView1, textView2;

    ArrayList<Integer> arrayList = new ArrayList<>();
    Repositorio repositorio = new Repositorio(this);

    int verificaSom;
    MediaPlayer somCoin;
    MediaPlayer somSpinnerNumero;
    MediaPlayer somGanhou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo1);

        imageButtonVoltar = (ImageButton) findViewById(R.id.imageButtonVoltar);
        imageButtonVoltar.setOnClickListener(this);

        imageButtonSom = (ImageButton) findViewById(R.id.imageButtonSom);
        imageButtonSom.setOnClickListener(this);

        spinnerA = (Spinner) findViewById(R.id.a);
        spinnerB = (Spinner) findViewById(R.id.b);
        spinnerC = (Spinner) findViewById(R.id.c);
        spinnerD = (Spinner) findViewById(R.id.d);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);


        verificaSom = repositorio.selectSom();
        somCoin = MediaPlayer.create(this, R.raw.som_coin);
        somSpinnerNumero = MediaPlayer.create(this, R.raw.som_spinner_numero);
        somGanhou = MediaPlayer.create(this, R.raw.som_ganhou);

        if(verificaSom == 0){
            imageButtonSom.setImageResource(R.drawable.nao_som);
        }else if(verificaSom == 1){
            imageButtonSom.setImageResource(R.drawable.som);
            somCoin.start();
        }//fim else

        configurarSpinner();

        //seleciona os valores dos jogos resolvidos
        arrayList = repositorio.setResultado(NUM_JOGO);
        for(int i=0; i<arrayList.size(); i++){
            switch (arrayList.get(i)){
                case 6: textView1.setBackgroundColor(Color.parseColor("#00ff00")); break;
                case 7: textView2.setBackgroundColor(Color.parseColor("#00ff00")); break;
            }//fim switch
        }//fim for

    }//fim onCreate


    private void configurarSpinner(){
        //para carregar o layout do Spinner suspenso
        Integer[] valores = new Integer[]{1, 2, 3, 4};

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this, R.layout.spinner_numeros, valores);
        //para o spinner suspenso
        adapter.setDropDownViewResource(R.layout.spinner_numeros_suspenso);

        spinnerA.setAdapter(adapter);
        spinnerB.setAdapter(adapter);
        spinnerC.setAdapter(adapter);
        spinnerD.setAdapter(adapter);

        //cor da seta do spinner
        spinnerA.setBackgroundColor(ContextCompat.getColor(this, android.R.color.transparent));
        spinnerB.getBackground().setColorFilter(Color.parseColor("#ffff00"), PorterDuff.Mode.SRC_ATOP);
        spinnerC.getBackground().setColorFilter(Color.parseColor("#ffff00"), PorterDuff.Mode.SRC_ATOP);
        spinnerD.getBackground().setColorFilter(Color.parseColor("#ffff00"), PorterDuff.Mode.SRC_ATOP);

        spinnerA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                a = (Integer) parent.getItemAtPosition(position);
                if(verificaSom == 1){somSpinnerNumero.start();}
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                b = (Integer) parent.getItemAtPosition(position);
                if(verificaSom == 1){somSpinnerNumero.start();}
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                c = (Integer) parent.getItemAtPosition(position);
                if(verificaSom == 1){somSpinnerNumero.start();}
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerD.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                d = (Integer) parent.getItemAtPosition(position);
                if(verificaSom == 1){somSpinnerNumero.start();}
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

    }//fim configuraSpinner()


    private void funcCalcular(){
        if((a+c)==(b+c+d)){
            confere1 = 1;
        }else{
            confere1 = 0;
        }//fim else

        if((a!=b)&&(a!=c)&&(a!=d)
                 &&(b!=c)&&(b!=d)
                 &&(c!=d))
        {
            confere2 = 1;
        }else{
            confere2 = 0;
        }//fim else

        if((confere1 == 1) && (confere2 == 1)){
            total = a+c;

            Toast.makeText(Jogo1Activity.this, "Acertou! Soma = " + String.valueOf(total), Toast.LENGTH_SHORT).show();

            if(total == 6){
                textView1.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 1, total);
            }//fim if

            if(total == 7){
                textView2.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 2, total);
            }//fim if

            //destrava o proximo jogo
            if(repositorio.selectResultado(NUM_JOGO) == null){
                repositorio.updateDestravaJogo(PROXIMO_JOGO);
                if(verificaSom == 1){somGanhou.start();}
                Intent it = new Intent(this, JogosActivity.class);
                startActivity(it);
                finish();
            }//fim if
        }//im if

    }//fim funcCalcular()

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonVoltar:
                    it = new Intent(this, JogosActivity.class);
                    startActivity(it);
                    finish();
                break;

            case R.id.imageButtonSom:
                int valor = repositorio.updateSom();
                if(valor == 0){
                    imageButtonSom.setImageResource(R.drawable.nao_som);
                    verificaSom = 0;
                }else if(valor == 1){
                    imageButtonSom.setImageResource(R.drawable.som);
                    verificaSom = 1;
                }//fim else
                break;
        }//fim switch
    }//fim onClick()

}//fim class
