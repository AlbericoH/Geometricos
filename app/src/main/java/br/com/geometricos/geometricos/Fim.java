package br.com.geometricos.geometricos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Fim extends AppCompatActivity implements View.OnClickListener{

    Intent it;

    ImageButton imageButtonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim);

        imageButtonVoltar = (ImageButton) findViewById(R.id.imageButtonVoltar);
        imageButtonVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonVoltar:
                it = new Intent(this, JogosActivity.class);
                startActivity(it);
                finish();
                break;
        }//fim switch
    }//fim onClick()
}
