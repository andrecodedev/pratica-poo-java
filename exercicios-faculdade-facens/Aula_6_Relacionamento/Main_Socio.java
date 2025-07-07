package Aula_6_Relacionamento;

public class Main_Socio {
    public static void main(String[] args) {
        Socio soc1 = new Socio("Fabio");
        
        Dependente dep1 = new Dependente("Karine");
        Dependente dep2 = new Dependente("Igor");
        Dependente dep3 = new Dependente("Ana Lívia");
        
        soc1.addDependente(dep1);
        soc1.addDependente(dep2);
        soc1.addDependente(dep3);
    }
}
