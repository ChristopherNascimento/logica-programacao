package Atividade03; import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int maior = 0;
        int menor = 1000;
        int soma = 0;
        for (int i = 1; i <= 5 ; i++) {

            System.out.println("Digite um número");
            int num = ler.nextInt();
            if(num > maior){
                maior = num;
        }
            if (num < menor){
                    menor = num;
            }
            soma = soma + num;
           
    }
        float media = (soma/5);
            System.out.println("Maior valor = " + maior );
            System.out.println("Menor valor = " + menor);
            System.out.println("A soma é " + soma );
            System.out.println("A media é " + soma / 5);
            System.out.println("O Resto = " + (soma % 5 ) );
            System.out.println("A Média fracionada "+ media);

       
       
       
       
        /*int media = 0;
        int soma = 0;   
        int valor[] = new int[5];
        for(int i = 0; i < valor.length; i++){
            System.out.println("digite o " +(i+1)+ " valor : ");
            valor[i] = ler.nextInt();
            soma = soma + valor[i];
        }
        int maior = valor[0];
        for(int i = 1 ; i < valor.length; i++){
            if(valor[i] > maior ){
                maior = valor[i];
            }
        }
        int menor = valor[0];
        for(int i = 1; i < valor.length; i++){
            if(valor[i] > menor ){
                menor = valor[i];
            }
        }
        System.out.println("Maior valor = " + maior );
        System.out.println("Menor valor = " + menor);
        System.out.println(" a soma é " + soma );
        System.out.println(" a media é " + media);*/
        ler.close();









    }
    
}
