package Atividade01;
    import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a sua 1° nota");
        
            float n1 = ler.nextFloat();
        
        System.out.println("Digite a sua 2° nota");

            float n2 = ler.nextFloat();

            ler.close();

    float media = (n1 + n2) / 2;
        
        System.out.println("Sua média foi de "+(media));

    if (media>=5) {
        System.out.println("Aprovado");

        
    } else {
        System.out.println("Reprovado");
        
    }

     
        





























    }
}
