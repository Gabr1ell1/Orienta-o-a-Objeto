import javax.swing.*;
public class caixa {


//atributo 
    private double saldo;
    
//construtores 
    //inicializando o atributo zerado
 public caixa(){
     this(0);
 }
//inicializando o atributo com o parametro
public caixa(double saldo){
    this.saldo = saldo;
}

//getter setter
public double getsaldo(){
    return saldo;
}
public void setsaldo(double saldo){
    this.saldo = saldo;
}

public void entrar(){
    //leitura de um valor, converte de String para double e atribui a variável valor
    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: "));
    /*soma o conteúdo do atributo saldo com a variável valor e passa o resultado por parametro
    para o método setsaldo()
    */
    this.setsaldo(this.saldo + valor);
    
}
public void retira(){
    //leitura de um valor, converte de String para double e atribui a variável valor
    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de retirada: "));
    /*subtrai o conteúdo do atributo saldo com a variável valor e passa o resultado por parametro
    para o método setsaldo()
    */
    this.setsaldo(this.saldo - valor);
    
}














    
}
