package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String tipoDeOperacao;
        double valor1, valor2, resultado;

        System.out.println("Tipos de operação: Adição, Subtração, Multiplicação, Divisão.");
        System.out.print("Escreva o tipo de operação desejada: ");
        tipoDeOperacao = ler.nextLine();
        System.out.print("Insira um valor: ");
        valor1 = ler.nextDouble();
        System.out.print("Insira um segundo valor: ");
        valor2 = ler.nextDouble();

        switch (tipoDeOperacao)
        {
            case "Adição","adição":
                resultado = valor1 + valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case "Subtração","subtração":
                resultado = valor1 - valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case "Multiplicação","multiplicação":
                resultado = valor1 * valor2;
                System.out.println("O resultado é: " + resultado);
                break;

            case "Divisão","divisão":
                resultado = valor1 / valor2;
                System.out.println("O resultado é: " + resultado);
                break;
        }
    }
}
