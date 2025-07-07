package Aula_10_Interface.TarefaAutomovel;

public class MotoAutomatica extends Moto implements IAutomatico {

    public MotoAutomatica(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("Moto automática mudando marcha automaticamente");
    }
}
