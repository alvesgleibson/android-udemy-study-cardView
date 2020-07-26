package com.example.cardviewclassejava.model;

import java.util.Date;

public class Postagem {

    private String name, postagem;
    private int imagem;
    private Date date;


    public Postagem() {
    }

    public Postagem(String name, String postagem, int imagem, Date date) {
        this.name = name;
        this.postagem = postagem;
        this.imagem = imagem;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
