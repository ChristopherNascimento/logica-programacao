package Exemplo;

public class ExemploLacoRepeticao {
    public static void main(String[] args){

        int contar = 1; // i
        while (contar <=10) {
            System.out.print(contar);
            System.out.print(" < dentro do loop while");
            //contar = contar + 1
            contar++;   
        }
        
        do{
            contar--; // equivalente a contar = contar +1
            System.out.print(contar);
            System.out.println(" < dentro do loop do-while");
        
        } while(contar > 1 );
    
    
    
    }   


}
