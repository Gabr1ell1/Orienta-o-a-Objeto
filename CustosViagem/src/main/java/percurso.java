import javax.swing.*;
public class percurso {
    
    private double kmpercorrida; 
    private double valorcombustivel;
    private double valorpedagio;
    
    
    
    //construtores 
    //inicializando o atributo zerado
    public percurso(){
     this(0,0,0);
 }
    //inicializando o atributo com o parametro
    public percurso(double kmpercorrida, double valorcombustivel, double valorpedagio) {
        this.kmpercorrida = kmpercorrida;
        this.valorcombustivel = valorcombustivel;
        this.valorpedagio = valorpedagio;
    }

    //getters setters
    public double getKmpercorrida() {
        return kmpercorrida;
    }
    public void setKmpercorrida(double kmpercorrida) {
        this.kmpercorrida = kmpercorrida;
    }

   
    public double getValorcombustivel() {
        return valorcombustivel;
    }

    public void setValorcombustivel(double valorcombustivel) {
        this.valorcombustivel = valorcombustivel;
    }

    
    public double getValorpedagio() {
        return valorpedagio;
    }

  
    public void setValorpedagio(double valorpedagio) {
        this.valorpedagio = valorpedagio;
    }

        
public void cadastrarPercurso(){ //método de cadastro o percurso
        setKmpercorrida(Double.parseDouble(JOptionPane.showInputDialog("Informe os quilômetros percorrido"))); //solicitando valor
        setValorcombustivel(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do combustível"))); //solicitando valor 
        setValorpedagio(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do pedágio"))); //solicitando valor 
           
    }

public void listarPercurso(){//método de listar
   JOptionPane.showMessageDialog(null,"Foi percorrido " +getKmpercorrida()+ " Km\nO valor do combustível foi R$"
           +getValorcombustivel()+"\nO valor do pedágio foi R$" +getValorpedagio());
   
}




}

