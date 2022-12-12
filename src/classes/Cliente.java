/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kaunda-daniel
 */
public class Cliente extends Pessoa{
    
    public Cliente(String nome){
        super(nome, null, null);
        
    }
    public Cliente(String nome, String telefone, String endereco){
        super(nome, telefone, endereco);
       
        
    }
    @Override
    public void sacar(double valor){
        if(valor>0.0){
            
        var saldoAtual=this.getSaldo();
        var novoSaldo=saldoAtual-valor;
        this.setSaldo(novoSaldo);
        }else{
            System.out.println("Impossível fazer a operação");
        }
               
    }
    @Override
    public void depositar(double valor){
        if (valor>0.0) {
            var saldoAtual=this.getSaldo();
            var novoSaldo=saldoAtual+valor+(valor*0.1);
            this.setSaldo(novoSaldo);
        }else{
            System.out.println("Impossível fazer a operação");
        }
    }

   
    public String toString(){
    return "Nome do Cliente:"+ getNome();
    }
}
