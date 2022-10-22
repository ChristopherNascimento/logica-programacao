package Atividade03;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    System.out.println("Escreva uma frase");
        String frase = ler.next();
    System.out.println("Informe quantas vezes essa frase vai ser repetida");
        int vezes = ler.nextInt();
    for (int i = 0; i < vezes ; i++) {
        System.out.println(frase);
    }









        
    }
}
