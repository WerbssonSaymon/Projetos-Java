package com.mycompany.conversacao;

import java.util.Scanner;


public class Conversacao {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String atendente = "Alexa"; 
        System.out.println("Olá, me chamo " + atendente + " bem vindo a sorveteria Pingolino, qual o seu nome? ");
        String nome = teclado.nextLine();
        System.out.println("É um prazer conhece-lo(a) " + nome);
        System.out.println("O que você gostaria? ");
        System.out.println("Temos: Sorvete, Açaí, Picolé, MilkShake e Sunday ");
        String produto = teclado.nextLine();
        System.out.println("Certo, quantas unidades do " + produto + " você quer ?");
        int quantidade = teclado.nextInt();
        System.out.println("Qual o sabor que você deseja? ");
        System.out.println("Temos: Chocolate, Morango, Kiwi, Nozes, Napolitano, Limão e Crene com Passas ");
        String sabor = teclado.nextLine();
        System.out.println("Ok, em qual mesa você está ? ");
        System.out.println("Para que o garçom possa levar seu pedido");
        int mesa = teclado.nextInt();
        System.out.println("Muito bem, então: ");
        System.out.println(quantidade + " " +  produto + " para o senhor(a) " + nome + " que está na mesa " + mesa);
        System.out.println("Em breve seu pedido estará pronto ");
        System.out.println("O pagamento é feito com o garçom ");
        System.out.println("Tenha uma boa refeição e volte sempre ");
    }
}
