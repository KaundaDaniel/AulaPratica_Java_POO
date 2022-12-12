package classes;

/**
 *
 * @author kaunda-daniel
 */
public class Atendimento {

    private int horas;
    private String data;
    private Cliente cliente;
    private Diarista diarista;

    public void setHoras(int horas) {
        if (horas < 1 || horas > 12) {
            System.out.println("A quantidade de horas de atendimento não pode ser menor que 1 e nem maior que 12");
        } else {
            this.horas = horas;
            System.out.println("");
        }
    }
    public int getHoras(){
        return horas;
    }
    public void setData(String data){
        this.data= data;
    }
    public String getData(){
        return data;
    }
    public void setCliente(Cliente cliente){
        this.cliente= cliente;
    }
    public Cliente getCliente(){

        return cliente;
    }
    public void setDiarista(Diarista diarista){
        this.diarista=diarista;
    }
    public Diarista getDiarista(){
        return  diarista;
    }

}
