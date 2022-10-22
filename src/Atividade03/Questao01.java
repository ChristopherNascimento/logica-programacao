package Atividade03; 
import java.util.Scanner;


public class Questao01 {        
    public static void main(String[] args) {

        //1. Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.
        Scanner guardar = new Scanner (System.in);        

        System.out.println("1. Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.");
        System.out.println("Escreva um numero");
            int numero = guardar.nextInt();
        System.out.println("==========");
        for (int i = 0; i <= 10; i++ ) {
            System.out.println(numero + " x " + i + " = " + (numero*i));

        }

        guardar.close();
        
        
        
        
        /*System.out.println(numero + " *  1 = " + numero*1);
        System.out.println(numero + " *  2 = " + numero*2);
        System.out.println(numero + " *  3 = " + numero*3);
        System.out.println(numero + " *  4 = " + numero*4);
        System.out.println(numero + " *  5 = " + numero*5);
        System.out.println(numero + " *  6 = " + numero*6);
        System.out.println(numero + " *  7 = " + numero*7);
        System.out.println(numero + " *  8 = " + numero*8);
        System.out.println(numero + " *  9 = " + numero*9);
        System.out.println(numero + " * 10 = " + numero*10);
        System.out.println("=============");*/
    
    
  }
 }
     
        