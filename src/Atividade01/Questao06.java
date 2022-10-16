package Atividade01; 
    
import java.util.Scanner;

public class Questao06 {

public static void main(String[] args) throws Exception {

    Scanner ler = new Scanner(System.in);

    System.out.println("Valor total da conta");
    
        float ValorTotal = ler.nextFloat();
    
    System.out.println("Total de pessaos que irão dividir a conta");
        
        int Pessoas = ler.nextInt();

        float ValorPago = ValorTotal / Pessoas;
    
        ler.close();

    System.out.println("o valor que cada pessoa vai pagar é de R$"+ValorPago);
    

    
    

    






    }
}
