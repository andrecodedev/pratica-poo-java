package Aula_10_Interface.TarefaAutomovel;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void alimentar() {
        System.out.println("Animal se alimentando");
    }
}
