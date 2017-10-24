package com.arqdsis.usjt.simuladorprova;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityBusca extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);
        Intent intent  = getIntent();
        String nome = intent.getStringExtra(MainActivity.INTENT_NOME);
        String interesse = intent.getStringExtra(MainActivity.INTENT_INTERESSE);

        TextView txtView = (TextView)findViewById(R.id.lbl_bemvindo);
        txtView.setText("Bem Vindo(a) " + nome + "!");
        ListView lst_lista = (ListView)findViewById(R.id.lst_livros);


        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getListOfBooks(interesse));
        lst_lista.setAdapter(arrayAdapter);

    }

    public ArrayList<String> getListOfBooks(String area){
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<Livro> livros = new ArrayList<Livro>();

        livros.add(new Livro("Concrete Mathematics","técnico"));
        livros.add(new Livro("The C++ Programming Language","técnico"));
        livros.add(new Livro("Guia dos Mochileiro das Galaxias","litetura"));
        livros.add(new Livro("Senhor dos Anéis","litetura"));

        for (int i = 0; i < livros.size();i++){
            if(livros.get(i).getArea().toLowerCase().equals(area.toLowerCase())){
                lista.add(livros.get(i).getNome());
            }
        }

        return  lista;
    }



}
