package testa;

import classes.Atendimento;
import classes.Cliente;
import classes.Diarista;

public class testaDiarista {
    
    public static void main(String[] args) {
        System.out.println("Ola Mundo");
        var diarista = new Diarista("Carla", "453424", "Kinaxixi", "234");
        var cliente = new Cliente("Pedro", "340299492", "Maianga");
        cliente.sacar(-45);
        cliente.getSaldo();
        diarista.setNome("Marta");
        diarista.getSaldo();
        var atendimento = new Atendimento();
        diarista.sacar(-405);
        diarista.setTelefone("9245939392");
        diarista.setEndereco("Sapu");
        // diarista1=new Diarista("Lucia", "912456786", "Maianga");
        System.out.println("Dados da Diarista: " + diarista.toString());
        System.out.println("Dados da Diarista: " + cliente.toString());
        
    }
}
