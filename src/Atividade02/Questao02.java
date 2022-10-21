package Atividade02;
import java.util.Scanner; 
public class Questao02 {
    public static void main(String[] args) throws Exception {
        Scanner escrever = new Scanner (System.in);
    System.out.println("Escreva um número");
        int num1 = escrever.nextInt();
    System.out.println("Escreva um número");
        int num2 = escrever.nextInt();
    System.out.println("Escreva um número");
        int num3 = escrever.nextInt();

            
    int NumeroMaior = 0;
    int NumeroMenor = 0;

        if (( num1 < num2 ) && ( num1 < num3 )){
            NumeroMenor =  num1;
        }
        if ((num1 > num2) && (num1 > num3)){
            NumeroMaior = num1;
       
       
        }else if((num2 < num1) && ( num2 < num3)){
            NumeroMenor = num2;
        }
        if ((num2 > num1) && (num2 > num3)){
            NumeroMaior = num2;


        } else if ((num3 > num1) && (num3 > num2)){
            NumeroMaior = num3;
        if ((num3 < num1) && (num3 < num2))
           NumeroMenor = num3; 
        
        }
            System.out.println("O número " + NumeroMaior + " é maior e o número " + NumeroMenor + " é o menor");

            escrever.close();
         
        }
}