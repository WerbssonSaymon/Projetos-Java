package desafioUML.apple.iphoneApps;

import desafioUML.apple.regrasApps.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Telefone está ligando para alguém");
    }

    @Override
    public void atender() {
        System.out.println("Telefone está atendendo uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Telefone iniciou um correio de voz");
    }
    
}
