package desafioUML.apple.iphoneApps;

import desafioUML.apple.regrasApps.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Ipod está tocando uma música");
    }

    @Override
    public void pausar() {
        System.out.println("Ipod pausou uma música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada no Ipod");
    }
    
}
