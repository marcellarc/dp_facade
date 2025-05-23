package br.fastfood.app;
import java.util.Scanner;
import br.fastfood.facade.ComboFacade;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Big Cheddar");
        System.out.println("2 – Combo Big Tasty");
        System.out.println("3 – Combo X-Burger");
        System.out.println("4 – Combo Sanduiche Natural");
        System.out.print("Sua escolha: ");
        int escolha = in.nextInt();

        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);
        facade.exibirItens();
        System.out.printf("Total a pagar: R$%.2f%n", facade.getPrecoTotal());
    }
}