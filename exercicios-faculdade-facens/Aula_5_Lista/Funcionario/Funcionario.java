package Aula_5_Lista.Funcionario;

public class Funcionario {
    private int codigo;
    private String nome;
    private String setor;
    private String funcao;
    private double salario;

    // Construtor padrão
    public Funcionario() {}

    // Construtor com parâmetros
    public Funcionario(int codigo, String nome, String setor, String funcao, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
        this.salario = salario;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para imprimir os dados do funcionário
    public String imprimir() {
        return "Código: " + codigo +
               "\nNome: " + nome +
               "\nSetor: " + setor +
               "\nFunção: " + funcao +
               "\nSalário: " + salario + "\n";
    }
}

