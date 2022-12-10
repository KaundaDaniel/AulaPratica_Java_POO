package classes;

public class Diarista extends Pessoa {

    /**
     *
     * @param nome
     * @param telefone
     * @param endereco
     */
    private String chavePix;

    public Diarista(String nome, String telefone, String endereco, String chavePix) {
        super(nome, telefone, endereco);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0.0) {

            var novoSaldo = this.getSaldo();
            var saldoAtual = novoSaldo - valor;
            this.setSaldo(saldoAtual);
        }else{
            System.out.println("Impossível fazer a operação!");
        }

    }

    @Override
    public void depositar(double valor) {
        if (valor > 0.0) {
            var saldoAtual = this.getSaldo();
            var novoSaldo = saldoAtual + valor;
            this.setSaldo(novoSaldo);
        } else {
            System.out.println("Impossível Fazer a operação!");
        }

    }
}
