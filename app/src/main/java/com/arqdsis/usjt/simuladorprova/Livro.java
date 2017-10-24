package com.arqdsis.usjt.simuladorprova;

/**
 * Created by rafae on 24/10/2017.
 */

public class Livro {

    private String nome;
    private  String area;

    public Livro(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
