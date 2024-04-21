import javax.swing.*;
public class principal {
    public static void main(String [] args){
        
         CalculadoraBasica calculadorabasica = new  CalculadoraBasica();
        double a = 0,b = 0, result;
         
         int op;
  do{//inicio do looping do-while
    op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Soma " + 
            "\n2 - Subtração \n3 - Multiplicação \n4 - Dividir \n0 - Sair"));
    
    switch(op){//abertura da estrutura de switch-case
        case 1: 
            calculadorabasica.soma();//chamada do método de soma
            break;
        case 2:
        a =(Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° numero")));
        b =(Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° numero")));
        calculadorabasica.subtrair(a, b);//passando os parametros a e b para o método 'subtrair' 
            break;
        case 3: 
            result=calculadorabasica.multiplicacao();//chamada do método de multiplicação
            calculadorabasica.setR(result);
            JOptionPane.showMessageDialog(null, "O resultado de '" +calculadorabasica.getN1()+ "' × '" +calculadorabasica.getN2()+ "' é : " +calculadorabasica.getR() );
            break;
        case 4:
         a = (Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° numero")));
         b = (Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° numero")));
         result =calculadorabasica.dividir(a, b);//passando os parametros a e b para o método 'dividir'
         calculadorabasica.setN1(a);
         calculadorabasica.setN2(b);
         calculadorabasica.setR(result);
         JOptionPane.showMessageDialog(null, "O resultado de '" +calculadorabasica.getN1()+ "'  ÷ '" +calculadorabasica.getN2()+ "' é : " +calculadorabasica.getR() );
            break;
        case 0:
            JOptionPane.showMessageDialog(null, "Saindo");
            break;
        default:
            
    }
  }while(op != 0);
        
         
         
         
        
    }
}
