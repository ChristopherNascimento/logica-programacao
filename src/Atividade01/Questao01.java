package Atividade01;
    import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a sua 1° nota");
        
            float n1 = ler.nextFloat();
        
        System.out.println("Digite a sua 2° nota");

            float n2 = ler.nextFloat();

            ler.close();

    float media = (n1 + n2) / 2;
        
        System.out.println("Sua média foi de "+(media));

    // aprovado >=7, recuperação >=4, reprovado < 4, erro digitação > 10 ou < 0


    if (media <= 0 || media > 10) {
        
        System.out.println("Erro de digitação");
        
    } else if (media < 7 ) {

        System.out.println("Recuperação");

    } else if (media < 4) {

        System.out.println("Reprovado");      
    
    } else {
        System.out.println("Aprovado");

    }              

                    
                
           

        
        
    }
}


     
    


 
   /*  if (media >=5 && media <= 10) {
        System.out.println("Aprovado");

        
    } else if (media >= 4 && media < 7) {

        System.out.println("Recuperação");

    } else if (media < 4 && media >= 0) {

        System.out.println("Reprovado");      
    
    } else {
        System.out.println("Erro de digitação");

    }              
        
                    
                
           

        
        
    }

     
    
}

*/
