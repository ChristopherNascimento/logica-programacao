package Exemplo.ExemploPoo;

public class Exemplo00 {
 public static void main(String[] args) {
    Caneta caneta1 = new Caneta("BIC","Azul");
   
    caneta1.printstatus();
    caneta1.rabiscar();
    caneta1.printstatus();
    caneta1.destampar();
    caneta1.rabiscar();
    caneta1.printstatus();
    caneta1.escrever("Christopher da Silva NAscimento");
    caneta1.printstatus();
    caneta1.escrever("Chris");
    caneta1.printstatus();
    Caneta caneta2 = new Caneta("BIC","PRETA");
    caneta2.printstatus();
    
 }   
}
