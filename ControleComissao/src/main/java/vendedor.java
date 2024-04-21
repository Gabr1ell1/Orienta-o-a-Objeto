import javax.swing.*;

import javax.swing.JOptionPane;

public class vendedor {
    
      
    //atributo 
    private String nome;
    private double Sb;
 
    
    //construtores 
    //inicializando o atributo zerado
    public vendedor(){
    this("",0);
}
    
    public vendedor(String nome, double Sb) {
        this.nome = nome;
        this.Sb = Sb;
    }

    public String getNome() {
        return nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }

    public double getSb() {
        return Sb;
    }

    public void setSb(double Sb) {
        this.Sb = Sb;
    }
    

    public double calculocomissao(double Valorvendido){ //método calculocomissao
        
        setNome(JOptionPane.showInputDialog("Informe o seu nome:")); //solicitando o nome
        setSb(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário base"))); //solicitando o salario base
        
        double comissao = Valorvendido * 0.10;          
        double NovoSal = getSb() + comissao;
        
        return NovoSal;
    }
}
