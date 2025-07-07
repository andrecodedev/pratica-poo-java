package Aula_10_Interface.TarefaAutomovel;

public abstract class Automovel {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Automovel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void acelera();
    public abstract void freia();
}
