import java.util.Scanner;

public class balada {
    public static void main(String[] args) {
        String nome;
        int idade;
        long cpf;


        Scanner teclado = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Bem vindo a nossa balada!");
        System.out.println("Qual é o seu nome?");
        nome = teclado.nextLine();
        System.out.println("Olá, " + nome + ". Qual é o seu CPF?");
        cpf = teclado.nextLong();
        System.out.println("Qual a sua idade? ");
        idade = teclado.nextInt();
        System.out.println("=============================");

        if(idade >=18){
            System.out.println("Entrada liberada!!");
        }else{
            System.out.println("Vá embora!!");
        }




    }


}
