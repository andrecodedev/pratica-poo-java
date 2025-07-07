package Aula_7_Heranca;

import java.util.ArrayList;

public class Main_Pessoa {
    public static void main(String[] args) {
        Aluno alu = new Aluno("123", "Joao", "33333");
        Aluno alu1 = new Aluno("123", "Mario", "33333");
        Aluno alu2 = new Aluno("123", "Maria", "33333");
        
        Professor prof = new Professor("Fabio", "23423", "F12");
        
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        lstPessoas.add(alu);
        lstPessoas.add(alu1);
        lstPessoas.add(alu2);
        lstPessoas.add(prof);
        
        for (Pessoa p : lstPessoas) {
            if (p instanceof Professor)
                System.out.println(p.imprimir());
        }
        
    }
}
