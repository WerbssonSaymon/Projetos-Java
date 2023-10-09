public class TesteCarro {

    public static void main(String[] args) {
        
        //Strategy

        ModeloCarro esportivo = new Esportivo();
        ModeloCarro passeio = new Passeio();

        Carro ferrari = new Carro();

        ferrari.setModelo(esportivo);
        ferrari.estilo();
        ferrari.quantAssentos();
        ferrari.velocidadeMaxima();

        Carro celta = new Carro();

        celta.setModelo(passeio);
        celta.estilo();
        celta.quantAssentos();
        celta.velocidadeMaxima();
    }
    
}
