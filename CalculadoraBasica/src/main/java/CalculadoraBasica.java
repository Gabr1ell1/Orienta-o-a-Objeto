import javax.swing.*;
public class CalculadoraBasica {
    
    //atributo 
    private double n1;
    private double n2;
    private double  r;
    
    //construtores 
    //inicializando o atributo zerado
 public CalculadoraBasica(){
     this(0,0,0);
 }
    //inicializando o atributo com o parametro
    public CalculadoraBasica(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    //getter setter

    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    
    
    
    public void soma(){ //método de soma
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° numero"))); //solicitando valor
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° numero"))); //solicitando valor 
        setR(this.getN1() + this.getN2()); 
        JOptionPane.showMessageDialog(null, "O resultado de '" +getN1()+ "' + '" +getN2()+ "' é : " +getR() );
    }
    public void subtrair(double c, double d){//método de subtração com parametros 
        setN1(c); //o valor de c será o valor de a da classe principal
        setN2(d); //o valor de d será o valor de b da classe principal
        setR(this.getN1() - this.getN2());
         JOptionPane.showMessageDialog(null, "O resultado de'" +getN1()+ "' - '" +getN2()+ "' é : " +getR() );
    }
    public double multiplicacao(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° numero")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° numero")));
        setR(this.getN1() * this.getN2());
         return getR();
    }
    public double dividir(double c, double d){//método de divisão com parametros
        setN1(c); //o valor de c será o valor de a da classe principal
        setN2(d); //o valor de d será o valor de b da classe principal
        setR(this.getN1() / this.getN2());
         return getR();
    }
    
}
 //será solicitado os valores e a operação no principal com um loop. os valores que estão lá serão chamados para os metódos subtrair e dividir;