public class mediaNota {
    public static void main(String[] args) {
        float notaIngles = 8.5f;
        float notaPortugues = 7.0f;
        float notaMatematica = 9.0f;
        float media = (notaIngles + notaPortugues + notaMatematica) / 3;
        
        System.out.printf("A média das notas é: %.2f, sendo %.2f de inglês, %.2f de português e %.2f de matemática.", media, notaIngles, notaPortugues, notaMatematica);

        System.out.println(" \n Com oferecimentos do CABO NASCIMENTO TECH.");
    }
}
