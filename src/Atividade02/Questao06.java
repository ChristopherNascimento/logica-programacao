package Atividade02; 
import java.util.Scanner;

public class Questao06 {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o seu peso?: ");
        float peso = ler.nextFloat();
        
        System.out.println("Qual a sua altura?: ");
        float altura = ler.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc <= 20){
            System.out.println("Seu IMC está abaixo do normal");
        } else if (imc >= 20.1 && imc <= 25 ){
            System.out.println("Seu IMC está normal");
        } else if (imc >= 25.1 && imc <= 30){
            System.out.println("Seu IMC está com sobrepeso");
        } else if (imc >= 30.1 && imc <= 35){
            System.out.println("Seu IMC está em obesidade leve");
        } else if (imc >= 35.1 && imc <= 40){
            System.out.println("Seu IMC está em obesidade moderada");
        } else if (imc >= 40.1){
            System.out.println("Seu IMC está em obesidade mórbida");
        }
        ler.close();



        
    }
    
}
