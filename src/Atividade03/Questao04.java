package Atividade03; import java.util.Scanner;

public class Questao04 {
    public static void main(String[] aargs){

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a palavra magica: ");
        int contar = 1;
        String palavra = ler.next();
        String palavraMagica = "java2022";
        // while(palavra.equals(anObeject: "palavraMagica")){}, assim nao le o while
        while (true) {
            if (!palavraMagica.equals(palavra)) {
                System.out.println("Palavra errada!!");
            }
            else {
                System.out.println("Palavra certa!!");
                break;
            }
            if (contar < 5) {
                System.out.println("Tente novamente digite nova palavra: ");
                contar++;
                palavra = ler.next();
            } else {
                System.out.println("Palavra errada!!");
                ler.close();
                break;
            }
        }







    }
}
