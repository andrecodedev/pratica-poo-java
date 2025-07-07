package Aula_5_Lista;

public class Arma {
    private String nome;
    private int dano;
    private String efeito;

    public Arma(String nome, int dano, String efeito) {
        this.nome = nome;
        this.dano = dano;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }
    
    public void atira() {
        System.out.println(efeito);
    }
    
    public void print() {
        System.out.println("Nome: "+nome);
        System.out.println("Dano: "+dano);
        System.out.println("Efeito: "+efeito);
    } 
}
