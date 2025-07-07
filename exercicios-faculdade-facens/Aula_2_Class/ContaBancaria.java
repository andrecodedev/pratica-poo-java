package Aula_2_Class;

public class ContaBancaria {
    private String id;
    private double saldo;
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (this.saldo >= valor)
            this.saldo -= valor;
        else
            System.out.println("Saldo insuficiente");
    }
}
