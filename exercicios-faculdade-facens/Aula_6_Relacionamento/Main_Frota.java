package Aula_6_Relacionamento;

public class Main_Frota {
    public static void main(String[] args) {
        Frota frota1 = new Frota("Frota X");
        
        // Agregacao
        /*Nave nav1 = new Nave("Space X");
        Nave nav2 = new Nave("Sputnik");
        
        frota1.addNave(nav1);
        frota1.addNave(nav2);*/
        
        // Composição
        frota1.addNave("Space X");
        frota1.addNave("Sputnik");
        
        frota1 = null;
        
    }
}
