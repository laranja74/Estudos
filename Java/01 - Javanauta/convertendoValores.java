import java.util.Scanner;

public class convertendoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga sua idade e eu somarei ela + 10. Idade: ");
        int idade = scanner.nextInt();
        Integer idadeInteger = (Integer) idade;

        System.out.println(idadeInteger + "+ 10 = " + (idadeInteger + 10));
    }
}
