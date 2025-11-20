import java.util.Scanner;

public class atribuindoValores {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Olá, qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + " seja bem-vindo!");

        System.out.println("Agora me responda qual é a sua idade? ");
        int idade = scanner.nextInt();
        System.out.println("" + nome + "" + idade + " anos de idade, Correto?");

        System.out.println("Você está empregado? sim (true) e não (false)");
        boolean resp = scanner.nextBoolean();
        System.out.println("Situação: " + resp);
        scanner.close();
    }
}
