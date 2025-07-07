package Aula_4;

public class Aluno {
    private String nome;
    private int nota1;
    private int nota2;

    public Aluno () { }
    
    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public Aluno(String nome, int nota1, int nota2) {
       this.nome = nome;
       this.nota1 = nota1;
       this.nota2 = nota2;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    
    // =================================
    public double calculaNota() {
        return this.nota1*0.30 + nota2*0.45;
    }
    
    public double calculaNota(int n1) {
        return n1*0.1 + this.nota2*0.50;
    }
    
    public double calculaNota(int n1, int n2) {
        return n1 + n2;
    }
}
