package Atividade02; import java.util.Scanner;

public class Questao04 {
    public static void main(String [] args) {
    
            Scanner tela = new Scanner(System.in);
        
        System.out.println("Informa sua idade: ");
            int idade = tela.nextInt();
        if(idade >= 18){
            System.out.println("Você pode dirigir");
        }else{
                System.out.println("Você não pode dirigir");
        }


            tela.close();


        
    }
    
}
