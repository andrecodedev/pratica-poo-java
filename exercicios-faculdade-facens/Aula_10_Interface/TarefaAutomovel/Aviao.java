package Aula_10_Interface.TarefaAutomovel;

public class Aviao implements IAutomatico, IVoa {
    private String modelo;

    public Aviao(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("Avião mudando marcha automaticamente");
    }

    @Override
    public void voar() {
        System.out.println("Avião voando");
    }

    public void decolar() {
        System.out.println("Avião decolando");
    }

    public void pousar() {
        System.out.println("Avião pousando");
    }
}
