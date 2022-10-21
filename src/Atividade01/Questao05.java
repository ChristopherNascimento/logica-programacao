package Atividade01;

 import java.util.Scanner;

    public class Questao05 {

     
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner (System.in);
    
        System.out.println("Insira o valor da comanda");

            float comanda = ler.nextFloat();
        
            float garcon = (comanda * 10/100);
            
                ler.close();

        System.out.println("A taxa de 10% do garçon é de R$ "+garcon);

            float totalconta = comanda + garcon; 

        System.out.println(String.format("%2f. + 10%s = %.2f",comanda,"%",(totalconta)));



    
















    }
}
