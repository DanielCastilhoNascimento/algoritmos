import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        /*Palindromo = palavra ou frase que tem o mesmo significado lendo da esquerda pra direita ou vice versa
        ex.: arara, ovo, ana, etc.

        o código abaixo verifica se a entrada é um palíndromo

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra : ");
        String palavra = scanner.nextLine();

        boolean palindromo = verificarEhPalindromo(palavra);
        System.out.println("É palindromo : " + palindromo);

        scanner.close();
    }

    private static boolean verificarEhPalindromo(String palavra) {
        String palavraInversa = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInversa += palavra.charAt(i);
        }

        return palavra.equals(palavraInversa);

    }
}