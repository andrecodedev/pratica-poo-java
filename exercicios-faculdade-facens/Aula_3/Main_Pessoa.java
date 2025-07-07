package Aula_3;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa pe = new Pessoa("Fabio", "123", "444");
        Pessoa pe1 = new Pessoa("Joao", "354", "5555");
       
        
        System.out.println(pe.getNome());
        
        pe.setNome("Fabio Colombini");
        
        System.out.println(pe.getNome());
    }
}
