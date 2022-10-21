package Atividade02; import java.util.Scanner;

public class Questao03 {
    public static void main(String [] args) throws Exception {
        Scanner guardar = new Scanner(System.in);
    
        System.out.println("Escreava sua idade");
            int idade = guardar.nextInt();
        if(idade >= 16){
            System.out.println("Você pode votar");

        }else {
            System.out.println("Você não pode votar");
            
        }
            guardar.close();

    }
}
