package Aula_6_Relacionamento.Exemplo;

class Pet {
    private String nome;
    private String raca;
    private int idade;

    public Pet(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String imprimir() {
        return "Pet: " + nome + ", Raça: " + raca + ", Idade: " + idade + " anos";
    }
}