public class Carro {

    private ModeloCarro modelo;

    public void setModelo(ModeloCarro modelo){
        this.modelo = modelo;
    }

    public void estilo(){
        modelo.estilo();
    }

    public void quantAssentos(){
        modelo.quantAssentos();
    }

    public void velocidadeMaxima(){
        modelo.velocidadeMaxima();
    }
}