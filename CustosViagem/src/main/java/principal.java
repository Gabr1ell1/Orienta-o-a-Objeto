import javax.swing.*;
public class principal 
{
    public static void main(String [] args)
    {
        
    percurso percurso = new percurso();    
    custos custos = new custos();
    
    int op;    
    do{
    //apresentando as opções
    op = Integer.parseInt(JOptionPane.showInputDialog("DIgite: \n1 - Cadastrar dados da viagem \n"
            + "2 - LIstar os dados da viagem \n3 - Apresentar o custo total da viagem \n4 - Sair"));
        
    switch(op){
        case 1:
          //chamando o método cadastrarPercurso da classe percurso
            percurso.cadastrarPercurso();
            break;
        case 2:
           //chamando o método listarPercurso da classe percurso
            percurso.listarPercurso();
            break;
        case 3:
            //chamando o método calcularViagem da classe custos com parametro percurso
           custos.calcularViagem(percurso);
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "Encerrando");
            break;
        default:   
            JOptionPane.showMessageDialog(null, "Opção inválida");
            }
    }while(op != 4);    
    
    
    
    
     }
    }