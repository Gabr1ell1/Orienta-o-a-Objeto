import javax.swing.*; //importação da API swing
public class principal {

public static void main(String [] args)
{
    
  caixa cx1 = new caixa(); //instancia do objeto cx1
  int op;
  do{//inicio do looping do-while
    op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Entrada " + 
            "\n2 - Retirada \n3 - Consultar saldo \n0 - Sair"));
    
    switch(op){//abertura da estrutura de switch-case
        case 1: 
            cx1.entrar();//chamada ao método entrar do objeto
            break;
        case 2:
            cx1.retira();
            break;
        case 3:
            //apresentação do conteúdo do atributo saldo
            JOptionPane.showMessageDialog(null, "Saldo Atual: " +cx1.getsaldo());
            break;
        case 0:
            JOptionPane.showMessageDialog(null, "Finalizando programa");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida");
    }
  }while(op != 0); // Repetirá as operações enquanto a opção for diferente de zero
    
    
  

}
}





