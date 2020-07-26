package com.example.cardviewclassejava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardviewclassejava.R;
import com.example.cardviewclassejava.adapter.PostagemAdapterClass;
import com.example.cardviewclassejava.model.Postagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagems = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerPostagem = findViewById(R.id.recyclerViewPrincipal);

        //Define Layaout Nesse caso sera Vertical
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //Esse Codigo seta o CardView para Horizontal
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerPostagem.setLayoutManager(layoutManager);

        //define Adapter
        this.prepararPostagem();
        PostagemAdapterClass adapterClass = new PostagemAdapterClass(postagems);
        recyclerPostagem.setAdapter(adapterClass);

    }

    public void prepararPostagem(){
        Postagem p;
        p = new Postagem("Gleibson Alves", "#TDB Legal na Viagem", R.drawable.imagem1,new Date());
        postagems.add(p);

         p = new Postagem("Mylena Alves", "Muito Massa", R.drawable.imagem2, new Date());
        postagems.add(p);

        p = new Postagem("Will Alves", "Au au au auuuuuuuu", R.drawable.imagem3, new Date());
        postagems.add(p);

        p = new Postagem("Penelope Alves", "AUUUUUUUUU", R.drawable.imagem4, new Date());
        postagems.add(p);



    }



}