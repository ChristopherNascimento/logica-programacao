package Atividade01; import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
      
        System.out.println("Escreva seu nome:");

            String nome = ler.nextLine();
       
        System.out.println("Valor por Hora");

           int ValorHora = ler.nextInt();
        
        System.out.println("Horas Trabalhadas");

            int HoraTrabalhada = ler.nextInt();

            ler.close();

            int salario = ValorHora * HoraTrabalhada;

        System.out.print("O funcionário "+nome+" deve receber o valor de R$"+salario);
 

        






























    }
}


