import javax.swing.*;
public class principal {
    public static void main(String [] args){
        
        //instanciando um novo objeto
        vendedor vendedor = new vendedor();
        double Valorvendido = 0; 
        
        Valorvendido = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu valor de vendas")); 
       
        double NovoSal = vendedor.calculocomissao(Valorvendido); //nova várivel com o valor do retorno do método de calculocomissao
        JOptionPane.showMessageDialog(null,"Olá " +vendedor.getNome()+", o seu novo salário é: \n" +NovoSal);

    }
}
