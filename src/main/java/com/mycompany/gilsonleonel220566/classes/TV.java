package com.mycompany.gilsonleonel220566.classes;

public class TV extends Produto {
    private String marca;
    public int polegadas;
    public String tamanho;

    public TV(int codigo, String nomeProduto, String descricaoProduto, double preco, int quantidade, String marca, int polegadas, String tamanho) {
        super(codigo, nomeProduto, descricaoProduto, preco, quantidade);
        this.marca = marca;
        this.polegadas = polegadas;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public String getTamanho() {
        return tamanho;
    }
}
