package br.senai.sp;

import java.util.Scanner;

public class balada {
        public static void main(String[] args) {
            String nome, nomeAcompanhante;
            int idade, idadeAcompanhante = 0;
            long cpf, cpfAcompanhante;
            boolean continuar = true;


                Scanner teclado = new Scanner(System.in);

                while(continuar) {

                    System.out.println("=============================");
                    System.out.println("Bem vindo a nossa balada!");
                    System.out.println("Qual é o seu nome?");
                    nome = teclado.next();
                    System.out.println("Olá, " + nome + ". Qual é o seu CPF?");
                    cpf = teclado.nextLong();
                    System.out.println("Qual a sua idade? ");
                    idade = teclado.nextInt();
                    System.out.println("=============================");

                    if (idade >= 18 && idade % 2 == 0) {
                        System.out.println("Entrada liberada!!");
                    } else if (idade >= 18 && idade % 2 == 1) {
                        System.out.println("=============================");
                        System.out.println("Qual é o nome do seu acompanhante?");
                        nomeAcompanhante = teclado.next();
                        System.out.println("Olá, " + nomeAcompanhante + ". Qual é o seu CPF?");
                        cpfAcompanhante = teclado.nextLong();
                        System.out.println("Qual a sua idade? ");
                        idadeAcompanhante = teclado.nextInt();
                        System.out.println("=============================");
                    } else {
                        System.out.println("Proibido a entrada de menores!!");
                    }

                    if ((idade + idadeAcompanhante) % 2 == 0 && idadeAcompanhante >= 18) {
                        System.out.println("Curtam bastante nossa balada!");
                    } else {
                        System.out.println("Vão embora!");
                    }

                    System.out.println("Deseja cadastrar mais pessoas? [1 - Sim / 2 - Não] ");
                    int opcao = teclado.nextInt();
                    if(opcao == 2){
                    continuar = false;
                    }
                }



        }


}
