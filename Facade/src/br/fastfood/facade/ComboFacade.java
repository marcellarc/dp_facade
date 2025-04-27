package br.fastfood.facade;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.Sobremesa;

public class ComboFacade {

    private Combo combo;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1 -> combo = new Combo(Burger.bigCheddar(), Bebida.refrigerante(), Sobremesa.sorvete());
            case 2 -> combo = new Combo(Burger.bigTasty(), Bebida.sucoDeLaranja(), Sobremesa.torta());
            default -> System.out.println("Combo inexistente.");
        }
    }

    public void exibirItens() {
        if (combo != null) {
            System.out.println("\n=== Itens do Combo ===");
            System.out.println("1 - " + combo.getBurger().getNome() + " - R$" + combo.getBurger().getPreco());
            System.out.println("2 - " + combo.getBebida().getNome() + " - R$" + combo.getBebida().getPreco());
            System.out.println("3 - " + combo.getSobremesa().getNome() + " - R$" + combo.getSobremesa().getPreco());
        } else {
            System.out.println("Nenhum combo criado.");
        }
    }

    public double getPrecoTotal() {
        if (combo == null) return 0;
        return combo.getPrecoTotal();
    }
}
