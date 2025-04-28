package br.fastfood.model;

public class Burger implements ItemCombo {

    private final String nome;
    private final double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static Burger bigCheddar() {
        return new Burger("Big Cheddar", 15.99);
    }

    public static Burger bigTasty() {
        return new Burger("Big Tasty", 20.99);
    }

    public static Burger xBurger() {
        return new Burger("X-Burger", 10.99);
    }

    public static Burger sanduicheNatural() {
        return new Burger("Sanduiche Natural", 9.99);
    }

    @Override
    public String toString() {
        return nome + "........R$" + preco;
    }
}
