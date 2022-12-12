package testa;

import classes.Atendimento;
import classes.Cliente;
import classes.Diarista;

public class testaDiarista {
    
    public static void main(String[] args) {
        
        var diarista = new Diarista("Carla", "453424", "Kinaxixi", "234");
        var cliente = new Cliente("Pedro", "340299492", "Maianga");
        cliente.depositar(1309.0);
        cliente.sacar(-45);
        System.out.println("Saldo do Cliente "+cliente.getSaldo());
        
        diarista.setNome("Marta");
        System.out.println("Saldo da Diarista " +diarista.getSaldo());
        var cliente2= new Cliente("Pedro", "93494242", "Palanca");
        cliente2.depositar(1390.8);
        cliente2.transferir(cliente, 230.90);
        var diarista4= new Diarista("Joy","897653","Maianga", "93494242");
        var diariasta5= new Diarista("Joy","897653","Maianga", "93494242");
        System.out.println(diariasta5.equals(diarista4);

        
        System.out.println(cliente2.getSaldo());
        System.out.println(cliente.getSaldo());

        diarista.sacar(-405);
        diarista.setTelefone("9245939392");
        diarista.setEndereco("Sapu");
        // diarista1=new Diarista("Lucia", "912456786", "Maianga");
        System.out.println("Dados da Diarista: " + diarista.toString());
        System.out.println("Dados da Diarista: " + cliente.toString());
        
    }
}
