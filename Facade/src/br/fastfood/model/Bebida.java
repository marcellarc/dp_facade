package br.fastfood.model;

public class Bebida implements ItemCombo {

    private final String nome;
    private final double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static Bebida cocaCola() {
        return new Bebida("Coca Cola", 5.00);
    }

    public static Bebida sucoDeLaranja() {
        return new Bebida("Suco de Laranja", 7.00);
    }

    public static Bebida sucoDeUva() {
        return new Bebida("Suco de Uva", 7.00);
    }

    public static Bebida chaGelado() {
        return new Bebida("Cha Gelado", 9.00);
    }

    @Override
    public String toString() {
        return nome + "........R$" + preco;
    }
}
