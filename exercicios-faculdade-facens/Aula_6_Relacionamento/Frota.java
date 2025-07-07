package Aula_6_Relacionamento;

import java.util.ArrayList;

public class Frota {
    private String nome;
    private ArrayList<Nave> lstNaves;

    public Frota(String nome) {
        this.nome = nome;
        lstNaves = new ArrayList<>();
    }
    
    public void addNave(String nome) {
        Nave tmp = new Nave(nome);
        lstNaves.add(tmp);
    }
}
