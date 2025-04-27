package br.fastfood.model;

public class Sobremesa implements ItemCombo{

    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static Sobremesa sorvete(){
        return new Sobremesa("Sorvete", 4.00);
    }

    public static Sobremesa torta(){
        return new Sobremesa("Torta", 6.00);
    }

    @Override
    public String toString() {
        return nome + "R$ " + preco;
    }

}
