package com.mycompany.gilsonleonel220566.classes;

public class Computador extends Produto {
    private String marca;
    public String tipo;

    public Computador(int codigo, String nomeProduto, String descricaoProduto, double preco, int quantidade, String marca, String tipo) {
        super(codigo, nomeProduto, descricaoProduto, preco, quantidade);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }
}
