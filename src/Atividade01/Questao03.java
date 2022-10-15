package Atividade01; import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) throws Exception {
       
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva seu nome");
            
            String nome = ler.nextLine();
        
            ler.close();
            
        System.out.println("Olá "+nome);
       
    }
}       