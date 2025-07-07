package Aula_5_Lista;

import java.util.ArrayList;

public class Espaconave {
    private String nome;
    private ArrayList<Arma> lstArmas;
    
    public Espaconave(String nome) {
        this.nome = nome;
        lstArmas = new ArrayList<>();
    }
    
    public void addArma(Arma arma) {
        lstArmas.add(arma);
    }
    
    public void addArma(String nome, int dano, String efeito) {
        Arma newArma = new Arma(nome, dano, efeito);
        addArma(newArma);
    }
    
    public void removeArma(Arma arma) {
        lstArmas.remove(arma);
    }
        
    public void removeArma(String nome) {
        for (int i=0; i < lstArmas.size(); i++) {
            if (lstArmas.get(i).getNome().equals(nome)) {
                lstArmas.remove(i);
            }
        }
    }
    
    public void atira(String nome) {
        for (Arma arma : lstArmas) {
            if (arma.getNome().equals(nome)) {
                arma.atira();
            }
        }
    }
    
    public void atiraTodas() {
        if (lstArmas.isEmpty()) {
            System.out.println("Sem armas no momento");
            return;
        }
        
        for (Arma arma : lstArmas) {
            arma.atira();
        }
    }
    
    public void listarArmas() {
        if (lstArmas.isEmpty()) {
            System.out.println("Sem armas no momento");
            return;
        }
        /*for (int i=0; i < lstArmas.size(); i++) {
            lstArmas.get(i).print();
        }*/
        
        for (Arma a : lstArmas) {
            a.print();
        }
    }
}
