package Aula_3;

public class Pessoa {
    private String cpf;
    private String nome;
    private String carteiraMotorista;
    
    // metodo construtor
    public Pessoa(String nome, String cpf, String carteiraMotorista) {
         this.nome = nome;
         this.cpf = cpf;
         this.carteiraMotorista = carteiraMotorista;
    }
    
    public void SetCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
    
    public String getCarteiraMotorista() {
        return this.carteiraMotorista;
    }
    
    public void imprimir() {
        
    }
}
