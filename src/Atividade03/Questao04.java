package Atividade03; import java.util.Scanner;

public class Questao04 {
    public static void main(String[] aargs){

        Scanner ler = new Scanner(System.in);
        String palavra= "";
        int i = 0;
        do {
                i++;
                System.out.println("Digite a palavra (Tentativa " + i + "/5)");
                palavra = ler.nextLine();
                if(palavra.equals("Java-2022")){
                    System.out.println("Palavra ok ");
                }else{
                    System.out.println("Palavra Errada");
                }
            } while (!palavra.equals("Java-2022") && i <5 );
            ler.close();







        // while(palavra.equals(anObeject: "palavraMagica")){}, assim nao le o while
       /*/ while (true) {
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
        }*/







    }
}
