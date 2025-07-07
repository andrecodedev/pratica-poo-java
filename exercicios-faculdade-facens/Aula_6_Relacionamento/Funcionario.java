package Aula_6_Relacionamento;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private ArrayList<Funcionario> lstSubordinados;

    public Funcionario(String nome) {
        this.nome = nome;
        
        lstSubordinados = new ArrayList<>();
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addSubordinado(Funcionario func) {
        lstSubordinados.add(func);
    }
}
