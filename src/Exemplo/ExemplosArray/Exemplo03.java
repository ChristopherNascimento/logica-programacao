    package Exemplo.ExemplosArray;
    import java.util.ArrayList;
    import javax.swing.JOptionPane;  



        public class Exemplo03 {
            // alterar
            public static void main(String[] args) {
                ArrayList<String> lista = new ArrayList<String>();
                int selecionado = 0;
                Object[] opcoes = { "Incluir", "Listar","Apagar","Alterar","Finalizar"};
                do{
                     selecionado = JOptionPane.showOptionDialog(null, "O que você deseja?",
                "Exemplo", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, opcoes, opcoes[0]);
                if (selecionado == 0){
                    String item = JOptionPane.showInputDialog("Digite");
                    lista.add(item);
                    
                }
                if (selecionado == 1) {
                    String msg = "";
                    for (String item : lista){
                        msg += item + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                }
                 if (selecionado == 2){
                    Object[] opcaoApagar = new Object[lista.size()];
                    for (int i = 0; i < opcaoApagar.length; i++) {
                        opcaoApagar[i] = lista.get(i);
                    }
                    Object itemSelecionado = JOptionPane.showInputDialog(null, "Selecionar o item para apagar", "apagar", JOptionPane.INFORMATION_MESSAGE, null, opcaoApagar, opcaoApagar[0]);
                    for (int i = 0; i < lista.size(); i++) {
                        if (itemSelecionado.toString().equals(lista.get(i))){
                            lista.remove(i);
                        }
                        
                    }
                
                }
                if(selecionado == 3){




                }    
            
            } while(selecionado != 4);



       
       
            }  
       
        }           
    
