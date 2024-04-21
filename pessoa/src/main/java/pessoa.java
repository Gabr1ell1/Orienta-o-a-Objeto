import javax.swing.JOptionPane;
public class pessoa {
    
    //atributos
    private String nome;
    private String endereco;
    private double salario;
    private String telefone;
    private String email;
    
    
    //construtores
    //inicializa os atributos vazios
    public pessoa(){
       this("","",0,"","");
    }
    
    
    //inicializa os atributos com valores passados por parametro
     public pessoa(String nome, String endereco, double salario, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
    }
    
    //getters e setter

   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

   
    
    
    public void inserirDados(){
        setNome(JOptionPane.showInputDialog("Digite o seu nome"));
        setEndereco(JOptionPane.showInputDialog("Digite o seu endereço"));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário")));
        setTelefone(JOptionPane.showInputDialog("Digite o seu telefone"));
        setEmail(JOptionPane.showInputDialog("Digite o seu e-mail"));
    }
    public void apresentarPessoa(){
 JOptionPane.showMessageDialog(null,"Nome: " +this.getNome() + "\n Endereço: " +this.getEndereco()+ "\n Salário: " +this.getSalario()+   "\n Telefone: " +this.getTelefone()+ "\n Email: " +this.getEmail() );
       
    }
    
    
}
