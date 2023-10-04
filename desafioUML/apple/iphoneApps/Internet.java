package desafioUML.apple.iphoneApps;

import desafioUML.apple.regrasApps.NavegadorInternet;

public class Internet implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Navegador Internet está exibindo uma página");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Navegador Internet está adicionando uma página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador Internet está atualizando uma página");
    }
    
}
