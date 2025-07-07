package Aula_7_Heranca;

public class Professor extends Pessoa {
    private String cracha;
    private char tipoVinculo;
    private float salario;

    public Professor() {
        
    }
    
    public Professor(String nome, String cpf, String cracha) {
        super(nome, cpf);
        this.cracha = cracha;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public String imprimir() {
        String msg = "\n#### PROFESSOR ###"+
                    super.imprimir()+
                    "\nCracha: " +cracha;
        
        return msg;
    }
}
