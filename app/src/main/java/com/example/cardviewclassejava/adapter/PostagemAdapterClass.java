package com.example.cardviewclassejava.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewclassejava.R;
import com.example.cardviewclassejava.model.Postagem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PostagemAdapterClass extends RecyclerView.Adapter<PostagemAdapterClass.MyViewHolder> {

    //Formatando a data
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //criando um atributo do tipo Postagem
    private List<Postagem> postagemList;

    public PostagemAdapterClass(List<Postagem> postagemList) {
        this.postagemList = postagemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater recebe 3 parametros 1 um xml do tipo postagem(Que foi Criado) 2 um parent e terceiro false
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_adapter, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Recuperar os valores do ArrayList usando o index position
        Postagem p = postagemList.get(position);

        //setando os valores para exibir
        holder.textNome.setText(p.getName());
        holder.imagePostagem.setImageResource(p.getImagem());
        holder.textPostagem.setText(p.getPostagem());
        holder.textData.setText(sdf.format(p.getDate()));

    }

    //Tamanho do CardView postagem.size
    @Override
    public int getItemCount() {
        return postagemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textNome, textPostagem, textData;
        private ImageView imagePostagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
            textData = itemView.findViewById(R.id.textData);
        }
    }
}
