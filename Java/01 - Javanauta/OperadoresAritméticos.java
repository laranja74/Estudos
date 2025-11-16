public class OperadoresAritméticos {
    public static void main(String[] args) {
        // Exemplos de operadores aritméticos em Java
        // 1. Adição (+)
        // 2. Subtração (-)
        // 3. Multiplicação (*)
        // 4. Divisão (/)
        // 5. Módulo (%)
        double energia = 83.4;
        double agua = 30.5;
        double internet = 80.0;
        double totalContas = energia + agua + internet;
        double energiaAumento = energia * 1.05; // Aumento de 5% na conta de energia
        double mediaContas = totalContas / 3;

        System.out.println("Total das contas: " + totalContas);
        System.out.println("Conta de energia após aumento: " + energiaAumento);
        System.out.println("Média das contas: " + mediaContas);
    }
}
