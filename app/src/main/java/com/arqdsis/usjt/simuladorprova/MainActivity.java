package com.arqdsis.usjt.simuladorprova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_NOME = "com.arqdsis.usjt.simuladorprova.nome";
    public static final String INTENT_INTERESSE = "com.arqdsis.usjt.simuladorprova.interesse";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BuscarLivros(View view) {
        Intent intent = new Intent(this,ActivityBusca.class);
        String nome = ((EditText)findViewById(R.id.ed_nome)).getText().toString();
        String interesse = ((EditText)findViewById(R.id.ed_interesse)).getText().toString();

        intent.putExtra(INTENT_NOME,nome);
        intent.putExtra(INTENT_INTERESSE,interesse);
        startActivity(intent);
    }
}
