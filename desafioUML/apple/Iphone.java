package desafioUML.apple;

import desafioUML.apple.iphoneApps.Internet;
import desafioUML.apple.iphoneApps.Ipod;
import desafioUML.apple.iphoneApps.Telefone;

public class Iphone {
    public static void main(String[] args) {
        Ipod ipod = new Ipod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        Telefone telefone = new Telefone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Internet internet = new Internet();
        internet.exibirPagina();
        internet.adicionarPagina();
        internet.atualizarPagina();
    }
}
