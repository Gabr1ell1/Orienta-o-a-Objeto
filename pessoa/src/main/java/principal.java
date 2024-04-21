import javax.swing.JOptionPane;
public class principal {
    public static void main(String [] args){
        
        
        //intanciação do objeto
        pessoa pessoa1 = new pessoa();
       //chamada ao inserirDadosPessoa() : void apresentarPessoa() : void  
       
        JOptionPane.showMessageDialog(null, "Insira seus Dados...");
        pessoa1.inserirDados();
        JOptionPane.showMessageDialog(null, "Apresentando dados");
        pessoa1.apresentarPessoa();
    }
    
}
