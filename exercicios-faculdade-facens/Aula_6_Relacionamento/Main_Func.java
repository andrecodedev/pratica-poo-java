package Aula_6_Relacionamento;

public class Main_Func {
    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario("Fabio");
        Funcionario func3 = new Funcionario("Ovidio");
        
        Funcionario func2 = new Funcionario("Eliney");
        
        func2.addSubordinado(func1);
        func2.addSubordinado(func3);
        
        
    }
}
