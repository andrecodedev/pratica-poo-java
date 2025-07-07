package Aula_10_Interface.TarefaAutomovel;

public class Morcego extends Animal implements IVoa {

    public Morcego(String especie) {
        super(especie);
    }

    @Override
    public void voar() {
        System.out.println("Morcego voando");
    }

    public void localizarEco() {
        System.out.println("Morcego localizando através de ecolocalização");
    }
}
