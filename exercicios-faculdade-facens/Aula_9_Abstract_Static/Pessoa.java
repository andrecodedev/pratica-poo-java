package Aula_9_Abstract_Static;

public abstract class Pessoa {
    private String nome;
    private static int contador;

    public Pessoa(String nome) {
        this.nome = nome;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public static void setContador(int contador) {
        Pessoa.contador = contador;
    }

    public static void mostratTotalContador() {
        System.out.println(contador);
    }
    
    public abstract void andar();
}
