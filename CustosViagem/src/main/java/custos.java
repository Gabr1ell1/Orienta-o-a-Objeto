import javax.swing.JOptionPane;
public class custos {

 
    private double totalPercurso;

    
    public custos(){
        this(0);
    }
    public custos(double totalPercurso){
            this.totalPercurso = totalPercurso;
    }
        
        
    public double getTotalPercurso() {
        return totalPercurso;
    }
    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
    
    public void calcularViagem(percurso percurso){
        double Kmpercorrida = percurso.getKmpercorrida();
        double Valorcombustivel = percurso.getValorcombustivel();
        double Valorpedagio = percurso.getValorpedagio();
        
        double Cv = ((Kmpercorrida * Valorcombustivel) + Valorpedagio);
        JOptionPane.showMessageDialog(null, "O custo total da Viagem foi: R$" +Cv);
    }
    
   
    
}
