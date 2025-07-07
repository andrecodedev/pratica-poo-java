package Aula_10_Interface.TarefaAutomovel;

public class CarroAutomatico extends Carro implements IAutomatico {

    public CarroAutomatico(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("Carro automático mudando marcha automaticamente");
    }
}
