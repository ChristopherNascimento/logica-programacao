package Atividade02; import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) throws Exception {
        Scanner escanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = escanner.nextInt();
        if (idade < 16) {
            System.out.println("Não pode votar nem dirigir");
        } else if (idade < 18){
            System.out.println("Pode votar, mas não pode dirigir");            
        } else {
            System.out.println("Pode votar e pode dirigir");            
        }
        escanner.close();
}
}