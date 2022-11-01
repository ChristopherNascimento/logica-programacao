package Exemplo.ExemplosArray; import java.util.Scanner;

public class Exemplo00 {
    public static void main(String[] args) {
        
    String[] pessoas = {"Chaves","Seu Madruga","Dona Florinda","Chiquinha"};
            System.out.println(pessoas.length);
            // Laço de repetição
        for (int i = 0; i < pessoas.length; i++) {
            String pessoa = pessoas[i];
            System.out.println(pessoa);
        }
        pessoas [0] = "Kiko";
        // 
        for (String pessoa: pessoas){
            System.out.println(pessoa);
        }

        

    }

    public static void somarNumeros(int[] numeros) {
    }

    public static void boasVindas() {
    }

    public static void ateLogo() {
    }

    public static char[] maior(int[] aleatorio) {
        return null;
    }

    public static char[] menor(int[] aleatorio) {
        return null;
    }
}
