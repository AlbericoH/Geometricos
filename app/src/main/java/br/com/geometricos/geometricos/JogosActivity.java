package br.com.geometricos.geometricos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

import br.com.geometricos.geometricos.database.Repositorio;

public class JogosActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    ImageButton button9;
    ImageButton button10;

    Intent it;

    Repositorio repositorio;

    int qtdJogosDestravados = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);

        button1 = (ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (ImageButton) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (ImageButton) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (ImageButton) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (ImageButton) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (ImageButton) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = (ImageButton) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button10 = (ImageButton) findViewById(R.id.button10);
        button10.setOnClickListener(this);

        repositorio = new Repositorio(this);
        qtdJogosDestravados = repositorio.selectTrava(); //para destravar os jogos
        mudarImagem(qtdJogosDestravados);

    }//fim onCreate

    @Override
    public void onResume(){
        super.onResume();

        qtdJogosDestravados = repositorio.selectTrava(); //para destravar os jogos
        mudarImagem(qtdJogosDestravados);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                if(qtdJogosDestravados >= 1){
                    it = new Intent(this, Jogo1Activity.class);
                    startActivity(it);
                    finish();
                }//fim if
                break;

            case R.id.button2:
                if(qtdJogosDestravados >= 2){
                    it = new Intent(this, Jogo2Activity.class);
                    startActivity(it);
                }//fim if
                break;

            case R.id.button3:
                if(qtdJogosDestravados >= 3){
                    it = new Intent(this, Jogo3Activity.class);
                    startActivity(it);
                }//fim if
                break;

            case R.id.button4:
                if(qtdJogosDestravados >= 4){
                    it = new Intent(this, Jogo4Activity.class);
                    startActivity(it);
                }//fim if
                break;

            case R.id.button5:
                if(qtdJogosDestravados >= 5){
                    it = new Intent(this, Jogo5Activity.class);
                    startActivity(it);
                }//fim if
                break;

            case R.id.button6:
                if(qtdJogosDestravados >= 6){
                    it = new Intent(this, Jogo6Activity.class);
                    startActivity(it);
                }//fim if
                break;

            case R.id.button7:
                if(qtdJogosDestravados >= 7){
                    it = new Intent(this, Jogo7Activity.class);
                    startActivity(it);
                }//fim if
                break;

            case R.id.button8:
                if(qtdJogosDestravados >= 8){
                    it = new Intent(this, Jogo8Activity.class);
                    startActivity(it);
                }//fim if
                break;

            case R.id.button9:
                if(qtdJogosDestravados >= 9){
                    it = new Intent(this, Jogo9Activity.class);
                    startActivity(it);
                }//fim if
                break;

            case R.id.button10:
                if(qtdJogosDestravados >= 10){
                    it = new Intent(this, Jogo10Activity.class);
                    startActivity(it);
                }//fim if
                break;
        }//fim switch
    }//fim onClick()

    private void mudarImagem(int qtdJogosDestravados2){
        switch (qtdJogosDestravados2){
            case 10: button10.setImageResource(R.drawable.jogo10);
            case 9: button9.setImageResource(R.drawable.jogo9);
            case 8: button8.setImageResource(R.drawable.jogo8);
            case 7: button7.setImageResource(R.drawable.jogo7);
            case 6: button6.setImageResource(R.drawable.jogo6);
            case 5: button5.setImageResource(R.drawable.jogo5);
            case 4: button4.setImageResource(R.drawable.jogo4);
            case 3: button3.setImageResource(R.drawable.jogo3);
            case 2: button2.setImageResource(R.drawable.jogo2);
        }
    }
}
