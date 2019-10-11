package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecycleView);

        List<Contatos> listContatos = new ArrayList<>();

        Contatos Henrique = new Contatos();
        Henrique.setNome("Henrique Dias");
        Henrique.setTelefone("+5511988387640");

        Contatos Lilian = new Contatos();
        Lilian.setNome("Lilian Gallo");
        Lilian.setTelefone("+5511988670619");

        Contatos Maria = new Contatos();
        Maria.setNome("Maria Luiza");
        Maria.setTelefone("+5511988528867");

        listContatos.add(Henrique);
        listContatos.add(Lilian);
        listContatos.add(Maria);

        recyclerView.setAdapter(new AdapterListContatos(listContatos, this));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

    }
}



