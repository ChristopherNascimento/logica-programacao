package Atividade01; import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um número ");

            int num1 = ler.nextInt();
         
            int num2 = (num1+1);

            int num3 = (num1-1);

        System.out.println("Número anterior ao que foi informado "+num3);

        System.out.println("Número informado "+num1);

        System.out.println("Número seguinte ao que foi informado "+num2);
        
        }
    
    }