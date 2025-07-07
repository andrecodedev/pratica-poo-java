package Aula_9_Abstract_Static;

public class Main_Pessoa {
    public static void main(String[] args) {
        Cliente p1 = new Cliente("Fabio");
        Cliente p2 = new Cliente("Joao");
        
        Pessoa.mostratTotalContador();
        Pessoa.setContador(99);
        
        Pessoa.mostratTotalContador();
    }
}
