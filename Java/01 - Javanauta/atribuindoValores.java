import java.util.Scanner;
public class atribuindoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Prazer em te conhecer, " + nome + "!");
    }
}