package Atividade02; 
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
        Scanner escanner = new Scanner(System.in);

       System.out.println("Informe uma número");

        int num1 = escanner.nextInt();

        if(num1<0 ){
                System.out.println("Menor que zero");
        }
        if(num1>0){
            System.out.println("Maior que zero");
        }
        if(num1 == 0 ) {
            System.out.println("Igual a zero");
        }
        escanner.close(); 









      }
    }