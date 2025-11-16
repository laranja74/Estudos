public class Strings {
    public static void main(String[] args) {

        String nome = "Gabriel";
        String segundoNome = "Letícia";
        String concatenacao = nome.concat(segundoNome);

        int tamanhoString = nome.length();
        boolean equals = nome.equals(segundoNome);


        System.out.println("O nome do primeiro participante é " + nome.toUpperCase() +" e o nome do segundo é " + segundoNome.toUpperCase() );
        System.out.println("Seus nomes são iguais? " + equals);
        System.out.println("Tamanho da String: " + tamanhoString);
        System.out.println("Tamanho da String: " + concatenacao.length() + " com o nome completo");

    }
}
