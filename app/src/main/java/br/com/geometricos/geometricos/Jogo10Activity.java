package br.com.geometricos.geometricos;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.media.MediaPlayer;
import java.util.ArrayList;

import br.com.geometricos.geometricos.database.Repositorio;

public class Jogo10Activity extends AppCompatActivity implements View.OnClickListener{

    Intent it;

    ImageButton imageButtonVoltar;
    ImageButton imageButtonSom;
    ImageButton imageButtonMostrarSoma;

    int NUM_JOGO = 10;
    int PROXIMO_JOGO = NUM_JOGO + 1;

    int a=1, b=1, c=1, d=1, e=1, f=1, g=1;
    int confere1, confere2;
    int total;

    Spinner spinnerA, spinnerB, spinnerC, spinnerD, spinnerE, spinnerF, spinnerG;
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7;

    ArrayList<Integer> arrayList = new ArrayList<>();
    Repositorio repositorio = new Repositorio(this);

    MediaPlayer somCoin;
    MediaPlayer somSpinnerNumero;
    MediaPlayer somGanhou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo10);

        imageButtonVoltar = (ImageButton) findViewById(R.id.imageButtonVoltar);
        imageButtonVoltar.setOnClickListener(this);

        imageButtonSom = (ImageButton) findViewById(R.id.imageButtonSom);
        imageButtonSom.setOnClickListener(this);

        spinnerA = (Spinner) findViewById(R.id.a);
        spinnerB = (Spinner) findViewById(R.id.b);
        spinnerC = (Spinner) findViewById(R.id.c);
        spinnerD = (Spinner) findViewById(R.id.d);
        spinnerE = (Spinner) findViewById(R.id.e);
        spinnerF = (Spinner) findViewById(R.id.f);
        spinnerG = (Spinner) findViewById(R.id.g);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);

        somCoin = MediaPlayer.create(this, R.raw.som_coin);
        somCoin.start();
        somSpinnerNumero = MediaPlayer.create(this, R.raw.som_spinner_numero);
        somGanhou = MediaPlayer.create(this, R.raw.som_ganhou);

        configurarSpinner();

        //seleciona os valores dos jogos resolvidos
        arrayList = repositorio.setResultado(NUM_JOGO);
        for(int i=0; i<arrayList.size(); i++){
            switch (arrayList.get(i)){
                case 13: textView1.setBackgroundColor(Color.parseColor("#00ff00")); break;
                case 14: textView2.setBackgroundColor(Color.parseColor("#00ff00")); break;
                case 15: textView3.setBackgroundColor(Color.parseColor("#00ff00")); break;
                case 16: textView4.setBackgroundColor(Color.parseColor("#00ff00")); break;
                case 17: textView5.setBackgroundColor(Color.parseColor("#00ff00")); break;
                case 18: textView6.setBackgroundColor(Color.parseColor("#00ff00")); break;
                case 19: textView7.setBackgroundColor(Color.parseColor("#00ff00")); break;
            }//fim switch
        }//fim for

    }//fim onCreate


    private void configurarSpinner(){
        //para carregar o layout do Spinner suspenso
        Integer[] valores = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this, R.layout.spinner_numeros, valores);
        //para o spinner suspenso
        adapter.setDropDownViewResource(R.layout.spinner_numeros_suspenso);

        spinnerA.setAdapter(adapter);
        spinnerB.setAdapter(adapter);
        spinnerC.setAdapter(adapter);
        spinnerD.setAdapter(adapter);
        spinnerE.setAdapter(adapter);
        spinnerF.setAdapter(adapter);
        spinnerG.setAdapter(adapter);

        //cor da seta do spinner
        spinnerA.getBackground().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_ATOP);
        spinnerB.getBackground().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_ATOP);
        spinnerC.getBackground().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_ATOP);
        spinnerD.getBackground().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_ATOP);
        spinnerE.getBackground().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_ATOP);
        spinnerF.getBackground().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_ATOP);
        spinnerG.getBackground().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_ATOP);

        spinnerA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                a = (Integer) parent.getItemAtPosition(position);
                somSpinnerNumero.start();
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                b = (Integer) parent.getItemAtPosition(position);
                somSpinnerNumero.start();
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                c = (Integer) parent.getItemAtPosition(position);
                somSpinnerNumero.start();
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerD.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                d = (Integer) parent.getItemAtPosition(position);
                somSpinnerNumero.start();
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerE.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                e = (Integer) parent.getItemAtPosition(position);
                somSpinnerNumero.start();
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerF.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                f = (Integer) parent.getItemAtPosition(position);
                somSpinnerNumero.start();
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerG.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                g = (Integer) parent.getItemAtPosition(position);
                somSpinnerNumero.start();
                funcCalcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

    }//fim configuraSpinner()


    private void funcCalcular(){
        if((a+b+c+d)==(a+c+e+f) && (a+b+c+d)==(c+d+f+g)){
            confere1 = 1;
        }else{
            confere1 = 0;
        }//fim else

        if((a!=b)&&(a!=c)&&(a!=d)&&(a!=e)&&(a!=f)&&(a!=g)
                 &&(b!=c)&&(b!=d)&&(b!=e)&&(b!=f)&&(b!=g)
                         &&(c!=d)&&(c!=e)&&(c!=f)&&(c!=g)
                                 &&(d!=e)&&(d!=f)&&(d!=g)
                                         &&(e!=f)&&(e!=g)
                                                 &&(f!=g))
        {
            confere2 = 1;
        }else{
            confere2 = 0;
        }//fim else

        if((confere1 == 1) && (confere2 == 1)){
            total = a+b+c+d;

            Toast.makeText(Jogo10Activity.this, "Acertou! Soma = " + String.valueOf(total), Toast.LENGTH_SHORT).show();

            if(total == 13){
                textView1.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 1, total);
            }//fim if

            if(total == 14){
                textView2.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 2, total);
            }//fim if

            if(total == 15){
                textView3.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 3, total);
            }//fim if

            if(total == 16){
                textView4.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 4, total);
            }//fim if

            if(total == 17){
                textView5.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 5, total);
            }//fim if

            if(total == 18){
                textView6.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 6, total);
            }//fim if

            if(total == 19){
                textView7.setBackgroundColor(Color.parseColor("#00ff00"));
                repositorio.updateFases(NUM_JOGO, 7, total);
            }//fim if

            //destrava o proximo jogo
            if(repositorio.selectResultado(NUM_JOGO) == null){
                repositorio.updateDestravaJogo(PROXIMO_JOGO);
                somGanhou.start();
                Intent it = new Intent(this, Fim.class);
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

                break;
        }//fim switch
    }//fim onClick()

}//fim class
