package com.mycompany.gilsonleonel220566.classes;

public class Produto {
    private int codigo;
    public String nome_produto;
    public String descricao_produto;
    public double preco;
    public int quantidade;

    public Produto(int codigo, String nomeProduto, String descricaoProduto, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome_produto = nomeProduto;
        this.descricao_produto = descricaoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeProduto() {
        return nome_produto;
    }

    public String getDescricaoProduto() {
        return descricao_produto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void calcular() {
        double total = preco * quantidade;
        System.out.println("Total da venda: " + total);
    }
}
