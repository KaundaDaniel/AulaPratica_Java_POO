
package classes;

import interfaces.IsSaldo;

/**
 *
 * @author kaunda-daniel
 */
public abstract class Pessoa  implements IsSaldo{
    private String nome;
    private String telefone;
    private String endereco;
    private double saldo;
    public Pessoa(){
        
    }
    public Pessoa(String nome, String telefone, String endereco){
        this.nome=nome;
        this.telefone=telefone;
        this.endereco=endereco;
        this.saldo=0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void transferir(IsSaldo objecto, double valor) {
        this.sacar(valor);
        objecto.depositar(valor);
    }
    @Override
    public String toString(){
        return "nome: "+ nome + " Telefone: " + telefone + "Endereco: " + endereco;
    }
    
}
